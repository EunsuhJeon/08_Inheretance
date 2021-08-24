package com.kh.chap01_beforeVSafter.after.mode.vo;


			// 자식 ----------> 부모
			// 후손 ----------> 조상
			// 하위 ----------> 상위
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand~price 네 개의 값들은 부모클래스(Product)의 필드에 대입해야 함.
		// super. 으로 부모에 접근 가능
		
		//super.brand = brand; // 단, private일 경우 접근이 불가함.
		// 해결방법1. 부모클래스에 있는 필드를 protected 접근제한자로 수정
		//super.brand = brand;
		
		// 해결방법2. 부모클래스에 있는 setter메소드 활용하기(public이기때문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모 생성자 호출하기
		super(brand, pCode, pName, price); // 반드시 첫줄에 기술할 것.
		
		this.allInOne = allInOne;
	}
	
	public boolean isAllINOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩: 부모클래스에 있는 메소드를 자식클래스에서 재정의하는 것
	public String information() {
		return super.information() + ", allInOne: "  + allInOne;
		
	}
	
}
