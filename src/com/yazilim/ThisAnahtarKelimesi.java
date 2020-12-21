package com.yazilim;

public class ThisAnahtarKelimesi {
	String ad;
	String soyad;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThisAnahtarKelimesi t=new  ThisAnahtarKelimesi("kubra");
	}
	public  ThisAnahtarKelimesi(String ad) {
		this(ad,"kirazlı");
	}
	public ThisAnahtarKelimesi(String ad, String soyad) {
		System.out.println(ad+" "+soyad);
	}
	

}
