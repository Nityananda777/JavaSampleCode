package com.core.collection;

import java.util.Date;

public class Fruit implements Comparable<Fruit> {

	private String fruitName;
	private String fruitDesc;
	private int quantity;
	private Date date;

	public Fruit(String fruitName, String fruitDesc, int quantity,Date date) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
		this.date=date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitDesc=" + fruitDesc + ", quantity=" + quantity + ", date="
				+ date + "]";
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		int qun = ((Fruit) o).getQuantity();
		return qun - this.quantity;
	}
}
