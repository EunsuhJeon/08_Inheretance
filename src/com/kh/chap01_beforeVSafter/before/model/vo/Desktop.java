package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public void setBrand(String brand) {
		
	}
	public void setpCode(String pCode) {
		
	}
	public void setpName(String pName) {
		
	}
	public void setPrice(int price) {
		
	}
	public void setAllInOne(boolean allInOne) {
		
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
	public boolean isAllInOne() {
		return allInOne;
	}
	
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode  + ", pName: " + pName  + ", price: " + price  + ", allInONe: " + allInOne;
	}
	
	
	
	
}
