package com.serialize;

public  class Customer {
//	Customer(String s)
//	{
//	super();
//	System.out.println("hello");
//	}
	private int custId;
	private String cusname;
	private String chome;
	private int payment;


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getChome() {
		return chome;
	}

	public void setChome(String chome) {
		this.chome = chome;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
}
