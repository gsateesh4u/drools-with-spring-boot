/**
 * 
 */
package com.usbank.loan.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

/**
 * @author Sateesh G
 *
 */
public class Customer {

	private String firstName;
	private String lastName;
	private String middleName;
	private String address;
	private String phone;
	private String ssn;
	private String email;
	private int age;
	private double income;
	private boolean isEligible;
	private String state;
	private boolean isVeteran;
	private String employementType;
	private List<String> comments;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the isEligible
	 */
	public boolean isEligible() {
		return CollectionUtils.isEmpty(this.comments) || this.comments.size()==0;
	}
	/**
	 * @param isEligible the isEligible to set
	 */
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
	/**
	 * @return the comments
	 */
	public List<String> getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	/**
	 * @param comment
	 */
	public void addComment(String comment){
		if(CollectionUtils.isEmpty(comments)){
			comments = new ArrayList<>();
		}
		this.comments.add(comment);
	}
	
	/**
	 * @return
	 */
	public boolean hasValidUSAddress(){
		boolean flag = true;
		if(StringUtils.isEmpty(this.address)){
			flag = false;
		}
		return flag;
	}
	public boolean hasValidSSN(){
		boolean flag = true;
		if(StringUtils.isEmpty(this.ssn)){
			flag = false;
		}
		return flag;
	}
	public boolean hasValidEmail(){
		boolean flag = true;
		if(StringUtils.isEmpty(this.email)){
			flag = false;
		}
		return flag;
	}
	public boolean hasValidPhone(){
		boolean flag = true;
		if(StringUtils.isEmpty(this.phone)){
			flag = false;
		}
		return flag;
	}
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the income
	 */
	public double getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the isVeteran
	 */
	public boolean isVeteran() {
		return isVeteran;
	}
	/**
	 * @param isVeteran the isVeteran to set
	 */
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	/**
	 * @return the employementType
	 */
	public String getEmployementType() {
		return employementType;
	}
	/**
	 * @param employementType the employementType to set
	 */
	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}
	
}
