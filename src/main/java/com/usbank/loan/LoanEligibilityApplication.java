package com.usbank.loan;

import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Sateesh G
 *
 */
@SpringBootApplication
public class LoanEligibilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanEligibilityApplication.class, args);
	}
	/**
	 * @return
	 */
	@Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        Resource resource = ResourceFactory.newClassPathResource("pre_eligibility_check.xls", getClass());
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem()
                .write(resource);

            KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem)
                .buildAll();
        KieRepository kieRepository = kieServices.getRepository();

        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();

        return kieServices.newKieContainer(krDefaultReleaseId);
    }
	  /*
     * Can be used for debugging
     * Input excelFile 
     */
    public String getDrlFromExcel(String excelFile) {
        DecisionTableConfiguration configuration = KnowledgeBuilderFactory.newDecisionTableConfiguration();
        configuration.setInputType(DecisionTableInputType.XLS);

        Resource dt = ResourceFactory.newClassPathResource(excelFile, getClass());

        DecisionTableProviderImpl decisionTableProvider = new DecisionTableProviderImpl();

        String drl = decisionTableProvider.loadFromResource(dt, null);

        return drl;
    }
}
