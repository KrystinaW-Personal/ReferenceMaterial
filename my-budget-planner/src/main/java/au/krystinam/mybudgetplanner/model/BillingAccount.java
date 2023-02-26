package au.krystinam.mybudgetplanner.model;

public class BillingAccount {

	private int billingAccountId;
	private String billingAccountName;
	
	public BillingAccount(int billingAccountId, String billingAccountName) {
		super();
		this.billingAccountId = billingAccountId;
		this.billingAccountName = billingAccountName;
	}
	public int getBillingAccountId() {
		return billingAccountId;
	}
	public void setBillingAccountId(int billingAccountId) {
		this.billingAccountId = billingAccountId;
	}
	public String getBillingAccountName() {
		return billingAccountName;
	}
	public void setBillingAccountName(String billingAccountName) {
		this.billingAccountName = billingAccountName;
	}
	
	
}
