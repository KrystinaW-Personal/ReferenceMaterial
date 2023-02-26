package au.krystinam.mybudgetplanner.model;

import javax.annotation.Generated;

public class Bill {
	
	@Generated(value = { "bill_id" })
	private int billId;
	private String billName;
	private String biller;
	private double billAmount;
	private int billSplitBy;
	private BillHolder billHolder;
	private BillingAccount billingAccount;
	
	public Bill(int billId, String billName, String biller, double billAmount, int billSplitBy, BillHolder billHolder,
			BillingAccount billingAccount) {
		super();
		this.billId = billId;
		this.billName = billName;
		this.biller = biller;
		this.billAmount = billAmount;
		this.billSplitBy = billSplitBy;
		this.billHolder = billHolder;
		this.billingAccount = billingAccount;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBiller() {
		return biller;
	}
	public void setBiller(String biller) {
		this.biller = biller;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getBillSplitBy() {
		return billSplitBy;
	}
	public void setBillSplitBy(int billSplitBy) {
		this.billSplitBy = billSplitBy;
	}
	public BillHolder getBillHolder() {
		return billHolder;
	}
	public void setBillHolder(BillHolder billHolder) {
		this.billHolder = billHolder;
	}
	public BillingAccount getBillingAccount() {
		return billingAccount;
	}
	public void setBillingAccount(BillingAccount billingAccount) {
		this.billingAccount = billingAccount;
	}
	
	
}
