package com.nit.sbeans;

public class Bank {
	private String bankName;
	private String ifscCode;
	private String bankAddress;
    
	 public Bank() {
		 System.out.println("Bank.Bank()");
	 }
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}



	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}



	public String getBankName() {
		return bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public String displayBankDetails() {
		 return "BankName :"+bankName+" ifscCode :"+ifscCode+" BankAddress :"+bankAddress;
	}
}
