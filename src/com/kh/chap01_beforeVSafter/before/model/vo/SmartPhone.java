package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
	
	public void setBrand(String brand) {
		
	}
	public void setpCode(String pCode) {
		
	}
	public void setpName(String pName) {
		
	}
	public void setPrice(int price) {
		
	}
	public void setMobileAgency(String mobileAgency) {
		
	}
	
	
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode  + ", pName: " + pName  + ", price: " + price  + ", mobileAgency: " + mobileAgency;
	}
	
	
}
