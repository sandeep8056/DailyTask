package com.spring.autowire;

public class Engine {

	private String enginetype;
	private int warranty;

	public String getEnginetype() {
		return enginetype;
	}

	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public void ImplementEngine() {
		System.out.println("Engine is implemented in your car");
	}

}
