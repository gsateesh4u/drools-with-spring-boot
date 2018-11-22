/**
 * 
 */
package com.usbank.loan.service;

import com.usbank.loan.model.Customer;

/**
 * @author Sateesh G
 *
 */
public interface EligibilityCheckService {

	public Customer checkPreEligibility(Customer customer);
}
