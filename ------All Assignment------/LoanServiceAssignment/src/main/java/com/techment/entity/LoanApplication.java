package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String bankName;
	private long minLoanAmount;
	private long maxLoanAmount;
	private double minInterestRate;
	private double minCreditScore;
	private double termLength;
	private double processingFee;
	private double rating;
	private String status;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getMinLoanAmount() {
		return minLoanAmount;
	}
	public void setMinLoanAmount(long minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}
	public long getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(long maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public double getMinInterestRate() {
		return minInterestRate;
	}
	public void setMinInterestRate(double minInterestRate) {
		this.minInterestRate = minInterestRate;
	}
	public double getMinCreditScore() {
		return minCreditScore;
	}
	public void setMinCreditScore(double minCreditScore) {
		this.minCreditScore = minCreditScore;
	}
	public double getTermLength() {
		return termLength;
	}
	public void setTermLength(double termLength) {
		this.termLength = termLength;
	}
	public double getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
