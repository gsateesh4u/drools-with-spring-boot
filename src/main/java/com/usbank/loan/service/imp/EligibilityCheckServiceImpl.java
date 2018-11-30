/**
 * 
 */
package com.usbank.loan.service.imp;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usbank.loan.Util.Util;
import com.usbank.loan.model.Customer;
import com.usbank.loan.service.EligibilityCheckService;

/**
 * @author Sateesh G
 *
 */
@Service
public class EligibilityCheckServiceImpl implements EligibilityCheckService {

	//uncomment below
	/* @Autowired
	 private KieContainer kieContainer;*/
	
	//added for testing
	Util appUtil = new Util();
	 
	/* (non-Javadoc)
	 * @see com.usbank.loan.service.EligibilityCheckService#checkPreEligibility(com.usbank.loan.model.Customer)
	 */
	@Override
	public Customer checkPreEligibility(Customer customer) {
		//uncomment below 
		//KieSession kieSession = kieContainer.newKieSession();
		//Added below just for testing purpose
		KieSession kieSession = appUtil.kieContainer().newKieSession();
        kieSession.insert(customer);
        kieSession.fireAllRules();
        kieSession.dispose();
		return customer;
	}

}
