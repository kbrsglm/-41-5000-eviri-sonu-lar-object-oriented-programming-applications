package com.yazilim;
enum Maaslar{
	ALI(3000),MEHMET(3000),OZAN(2000);
	public int maas;
	
	Maaslar(int  m)
	{
		maas=m;
	}
	static void method() {
		System.out.println("burası bir method");
	}
	  int maasGoster() {
		 return maas;
	 }
}
public class Enum3 {
       public static void main(String args[]) {
    	   System.out.println(Maaslar.ALI.maasGoster());
    	   System.out.println(Maaslar.MEHMET.maas);
    	   System.out.println(Maaslar.OZAN.maasGoster());
    	   Maaslar.method();
    	  
       }

}
