/**
 * 
 */
package com.usbank.loan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usbank.loan.model.Customer;
import com.usbank.loan.service.EligibilityCheckService;

/**
 * @author Sateesh G
 *
 */
@RestController
@RequestMapping("/check-eligibility")
public class EligibibilityCheckController {

	@Autowired
	EligibilityCheckService eligibilityCheckService;
	
	/**
	 * @param customer
	 * @return
	 */
	@PostMapping
	public Customer checkPreEligibility(@RequestBody Customer customer){
		return eligibilityCheckService.checkPreEligibility(customer);
	}
}
