package com.yazilim;

enum aylar{
	OCAK,SUBAT,MART,NISAN
}

public class Enum2 {

	
	public static void main(String[] args) {
		
   int x= aylar.NISAN.ordinal();
    switch(x) {
    case 0:
    	System.out.println("ocak ayındayız");
    	break;
    case 1:
    	System.out.println("subat ayındayz");
    	break;
    case 2:
    	System.out.println("mart ayındayız");
    	break;
    case 3:
    	System.out.println("nısan ayındayız");
    	break;
    	default:
    		System.out.println("gecersiz deger girdiniz");
    		break;
    }
	}

}
