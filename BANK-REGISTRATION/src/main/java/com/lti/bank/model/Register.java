package com.lti.bank.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq1", sequenceName = "customer_sequence", allocationSize = 1, initialValue = 108897)
@Table(name="customer")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
	@Column(name="C_ID")
	private int customerId;
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="FATHER_NAME")
	private String fatherName;
	@Column(name="MOBILE_NO")
	private long mobileNo;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ADHAAR_NO")
	private long adhaarNo;
	@Column(name="PAN_NO")
	private String panNo;
	@Column(name="DATE_OF_BIRTH")
	private String dateOfBirth;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="STATE")
	private String state;
	@Column(name="CITY")
	private String city;
	@Column(name="PINCODE")
	private long pincode;
	@Column(name="OCCUPATION_TYPE")
	private String occupationType;
	@Column(name="ANNUAL_INCOME")
	private double annualIncome;


	public Register() {
		super();
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getAdhaarNo() {
		return adhaarNo;
	}


	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}


	public String getPanNo() {
		return panNo;
	}


	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public String getOccupationType() {
		return occupationType;
	}


	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}


	public double getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", fatherName=" + fatherName + ", mobileNo=" + mobileNo + ", email=" + email + ", adhaarNo="
				+ adhaarNo + ", panNo=" + panNo + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", state="
				+ state + ", city=" + city + ", pincode=" + pincode + ", occupationType=" + occupationType
				+ ", annualIncome=" + annualIncome + "]";
	}


	public Register(int customerId, String customerName, String gender, String fatherName, long mobileNo, String email,
			long adhaarNo, String panNo, String dateOfBirth, String address, String state, String city, long pincode,
			String occupationType, double annualIncome) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.fatherName = fatherName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.adhaarNo = adhaarNo;
		this.panNo = panNo;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.occupationType = occupationType;
		this.annualIncome = annualIncome;
	}


	

	
	
}
