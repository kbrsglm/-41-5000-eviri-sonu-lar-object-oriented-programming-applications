package com.yazilim;



public class YeniGetterSetter {
	private String ad;
	private int deger;
	

	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getDeger() {
		return deger;
	}
 

	public void setDeger(int deger) {
		this.deger = deger;
	}

	 public YeniGetterSetter(String ad,int sayi) {
		 setAd(ad);
		 setDeger(sayi);
	 }
	 public void method() {
		 System.out.println("merhaba dunya");
	 }
	  public YeniGetterSetter() {
		  method();
	  }
	 
	public static void main(String[] args) {
	   YeniGetterSetter n1= new YeniGetterSetter();
       YeniGetterSetter s=new YeniGetterSetter("sezer",234);
       System.out.println(s.getAd());
       System.out.println(s.getDeger());
       
       
       
	}

}
