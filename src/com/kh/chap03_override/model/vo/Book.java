package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {

	private String title;
	private String author;
	private int price;
	
	// �⺻������
	public Book() {
		
	}
	
	// �Ű����� ������
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// getter/setter �޼ҵ�
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	
	/*
	 * * �������̵�
	 * - �ڽ�Ŭ������ ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ� ��.
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * 	  �ڽİ�ü�� ���� ���� �� �ڽĸ޼ҵ尡 �켱���� ����
	 * 
	 * * �������̵� ���� ����
	 * - �θ�޼ҵ�� ����
	 * - �Ű����� ����, �ڷ���, ���� ����(�Ű��������� �������)
	 * - �θ�޼ҵ��� ��ȯ�� ���� (jdk �������� �Ǹ鼭 �θ�޼ҵ��� ��ȯ���� �ڽ� �ڷ�����δ� ����)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ���Ѵ�.
	 * 		ex) �θ�޼ҵ��� ���������ڰ� protected�� ��� �������̵��ϴ� �޼ҵ��� ���������ڴ� protected, public
	 * 
	 * => �Ծ��� ������ ������ (������ �Ϸ��� �� ������ ��Ģ�� ��������Ѵ�~~)
	 * 
	 * * @Override ������̼�
	 * - ���� ����. ũ�� ��� ���� (������� �ʾƵ� �������̵� �� ����)
	 * - ������̼� �ۼ��ϴ� ����
	 * 	  >> �θ�޼ҵ���̳� �Ű������� ������ ��� => ã�ƺ��� ����.
	 * 		  �ڽĸ޼ҵ� ��� �� ��Ÿ�� ���� ��� => ã�ƺ��� ����.
	 * 	  >> ���� �������̵��� �޼ҵ��� ���� �˸��� ����.
	 */
	
	@Override
	public String toString() { // Object Ŭ������ toString �޼ҵ� �������̵�
		return "title: " + title + ", author: " + author + ", price: " + price;
	}
}
