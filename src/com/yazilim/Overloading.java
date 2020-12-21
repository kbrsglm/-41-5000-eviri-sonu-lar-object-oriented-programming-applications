package com.yazilim;

public class Overloading {
    
	void method1()
	{
		System.out.println("parametre almadı");
	}
	
	void method2(int sayi)
	{
		System.out.println("parametre alan method");
	}
	public Overloading() {
		method1();
	}
	public Overloading(int sayi)
	{
		method2(sayi);
	}
	public static void main(String[] args) {

         Overloading n1=new Overloading();
         Overloading n2=new Overloading(10);
         n2.method2(5);
         n1.method2(7);
         n2.method1();
	}

}
