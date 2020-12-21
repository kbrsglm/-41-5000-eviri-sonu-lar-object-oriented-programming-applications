package com.yazilim;

public class Yapicilar {
	 int deger1,deger2;
	
	public Yapicilar() {
		
		deger1=5;
	}
	public Yapicilar(int sayi) {
		deger2=sayi;
		deger1=sayi;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Yapicilar nesne1=new Yapicilar();
        Yapicilar nesne2= new Yapicilar(90);
        System.out.println(nesne1.deger1);
        System.out.println(nesne2.deger2);
	}	

}
