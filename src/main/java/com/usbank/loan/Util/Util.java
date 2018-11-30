/**
 * 
 */
package com.usbank.loan.Util;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;

/**
 * @author Sateesh G
 *
 */
public class Util {

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
}
