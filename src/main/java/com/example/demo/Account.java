package com.example.demo;

import java.util.Date;

public class Account {
	// private int accountNumber; --> add account number logic too
	private String ownerName;
	private Address address;
	private float balanceAmount;
	private Date dateCreated;
	private AccountStatus accountStatus;
	private AccountType accountType;
	
	public Account(String ownerName, Address address, float balanceAmount, Date dateCreated,
			AccountStatus accountStatus, AccountType accountType) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balanceAmount = balanceAmount;
		this.dateCreated = dateCreated;
		this.accountStatus = accountStatus;
		this.accountType = accountType;
	}

	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public float getBalanceAmount() {
		return balanceAmount;
	}
	
	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public void depositMoney() {
		System.out.println("Money depositted successfully");	
	}
	
	public void withdrawMoney() {
		System.out.println("Money withdrwan successfully");
	}
	
	public void openNewAccount() {
		System.out.println("New Account opened successfully");
	}
	
	public void showAccountDetails(int accountNumber) {
		System.out.println("Below are your Account Details");
	}
}	