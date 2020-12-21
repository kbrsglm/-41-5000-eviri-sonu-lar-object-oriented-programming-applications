package com.yazilim;

public class GetterSetter {
	private int deger;
	private  String adi;

	public static void main(String[] args) {
	    GetterSetter n1=new GetterSetter();
	    n1.setAdi("kubra");
	    n1.setDeger(500);
	    System.out.println(n1.getDeger());
	    System.out.println(n1.getAdi());
        String k = n1.adi;
        System.out.println(k);
	}

	public int getDeger() {
		return deger;
	}

	public void setDeger(int deger) {
		this.deger = deger;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

}
