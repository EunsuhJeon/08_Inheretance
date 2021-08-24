package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.mode.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.mode.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.mode.vo.Tv;

public class AfterRun {

	public static void main(String [] args) {
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이 (프로그램의 생산성과 유지보수에 크게 기여)
		 */
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		// Tv객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-01", "겁나얇은티비", 3500000, 70);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1500000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1200000); // 부모 클래스에 있는 메소드 호출
		s.setMobileAgency("SK"); // 자식클래스에 있는 메소드 호출
		System.out.println("===========수정 후===========");
		System.out.println(s.information());
		
		/*
		 * * 상속의 특징
		 * - 자식객체를 가지고 부모클래스에 있는 메소드를 마치 내 것처럼 호출 간으
		 * - 부모클래스에 있는 메소드를 오버라이딩을 통해 자식클래스의 재정의 기능
		 * => 오버라이딩을 하는 순간 자식클래스에 있는 메소드가 우선권을 가짐
		 * - 클래스 간의 상속은 다중상속이 불가능하다(단일상속만 가능함)
		 */
	
	}
}
