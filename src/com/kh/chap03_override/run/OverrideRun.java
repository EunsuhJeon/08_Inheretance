package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {

		Book bk1 = new Book("������ ����", "������", 100);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�.", "��", 300);
		
		System.out.println(bk1);
		System.out.println(bk2);
		// ��¹��� ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� �ش� ���۷���.toString ����
		// �� �� ���ƿ� ��� ���
		
		// �������̵� ��: Object Ŭ������ toString() ���� => ǮŬ������ + @ + ��ü�� �ؽ��ڵ��� 16���� �� ����
		// �������̵� ��: Book Ŭ������ toString() ���� => �ش� ��ü�� ������ �ִ� ��� �ʵ� ���� �� ���ڿ��� ���� ����
		
		
		
		
	}

}
