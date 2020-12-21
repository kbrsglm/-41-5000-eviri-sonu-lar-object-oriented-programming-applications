package com.yazilim;

public class StaticKisiler {
	 String ad;
	 String soyadi;
	 String cinsiyet;
	static  int sayi;
	
	public StaticKisiler(String ad,String soyadi,String cinsiyet) {
		this.ad=ad;
		this.soyadi=soyadi;
		this.cinsiyet=cinsiyet;
	    sayi++;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticKisiler.sayi);
		StaticKisiler s=new StaticKisiler("Kübra","SAĞLAN","kadın");
		StaticKisiler s2=new StaticKisiler("erdem", "saglam", "erkek");
		StaticKisiler s3=new StaticKisiler("ozan","saglam","erkek");
		System.out.println("nesneler olustuktan sonraki kişi sayısı"+StaticKisiler.sayi);
		
	}
	
	
}
