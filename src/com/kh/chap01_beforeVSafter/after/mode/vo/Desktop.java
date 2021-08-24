package com.kh.chap01_beforeVSafter.after.mode.vo;


			// �ڽ� ----------> �θ�
			// �ļ� ----------> ����
			// ���� ----------> ����
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand~price �� ���� ������ �θ�Ŭ����(Product)�� �ʵ忡 �����ؾ� ��.
		// super. ���� �θ� ���� ����
		
		//super.brand = brand; // ��, private�� ��� ������ �Ұ���.
		// �ذ���1. �θ�Ŭ������ �ִ� �ʵ带 protected ���������ڷ� ����
		//super.brand = brand;
		
		// �ذ���2. �θ�Ŭ������ �ִ� setter�޼ҵ� Ȱ���ϱ�(public�̱⶧���� ���� ����)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ���3. �θ� ������ ȣ���ϱ�
		super(brand, pCode, pName, price); // �ݵ�� ù�ٿ� ����� ��.
		
		this.allInOne = allInOne;
	}
	
	public boolean isAllINOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// �������̵�: �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ�������� �������ϴ� ��
	public String information() {
		return super.information() + ", allInOne: "  + allInOne;
		
	}
	
}
