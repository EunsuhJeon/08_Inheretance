package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun {

	public static void main(String[] args) {

		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		((Vehicle)c).howToMove(); // 부모클래스로 형변환을 해도 자식클래스가 실행됨.
		s.howToMove();
		a.howToMove();
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이 (프로그램의 생산성과 유지보수에 크게 기여)
		 * 
		 * * 상속의 특징
		 * - 클래스 간의 상속에 있어서는 다중상속이 불가(단일상속만 가능. 즉, 부모는 하나다)
		 * - 부모클래스에 정의되어 있는 protected필드는 자식클래스에서 직접 접근 가능
		 * - 자식객체는 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
		 * 	 + 부모클래스에 있는 메소드를 변형하고 싶으면 자식클래스에서 오버라이딩이 가능(내 입맛대로 재정의할 수 있음)
		 * - 명시되어있지 않지만 모든 클래스(자바에서 제공하는 클래스, 직접 만드는 클래스)는 Object라는 클래스의 후손이다!
		 * 	 => 즉, Object 클래스에 있는 메소드를 마음대로 호출 가능
		 * 	 => 뿐만 아니라 오버라이딩을 통해 재정의도 가능함!
		 */
		
		System.out.println(c.hashCode()); // Object 클래스에 있는 hashCode메소드
		System.out.println(c.equals(s));
		System.out.println(c); // .toString이 생략된 것.
		System.out.println(c.toString());
	}

}
