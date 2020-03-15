package org.pharmacy.poc.model;

public class Payment {

	private int emplId;
	private double paymentAmount;
	private String paymentOption;
	private String ccEnd;
	private String ccBank;

	public Payment() {

	}

	public Payment(int emplId, double paymentAmount, String paymentOption, String ccEnd, String ccBank) {
		this.emplId = emplId;
		this.paymentAmount = paymentAmount;
		this.paymentOption = paymentOption;
		this.ccEnd = ccEnd;
		this.ccBank = ccBank;
	}

	/**
	 * @return the emplId
	 */
	public int getEmplId() {
		return emplId;
	}

	/**
	 * @param emplId the emplId to set
	 */
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	/**
	 * @return the paymentAmount
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 * @return the paymentOption
	 */
	public String getPaymentOption() {
		return paymentOption;
	}

	/**
	 * @param paymentOption the paymentOption to set
	 */
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	/**
	 * @return the ccEnd
	 */
	public String getCcEnd() {
		return ccEnd;
	}

	/**
	 * @param ccEnd the ccEnd to set
	 */
	public void setCcEnd(String ccEnd) {
		this.ccEnd = ccEnd;
	}

	/**
	 * @return the ccBank
	 */
	public String getCcBank() {
		return ccBank;
	}

	/**
	 * @param ccBank the ccBank to set
	 */
	public void setCcBank(String ccBank) {
		this.ccBank = ccBank;
	}

	@Override
	public String toString() {
		return "Payment [emplId=" + emplId + ", paymentAmount=" + paymentAmount + ", paymentOption=" + paymentOption
				+ ", ccEnd=" + ccEnd + ", ccBank=" + ccBank + "]";
	}

}
