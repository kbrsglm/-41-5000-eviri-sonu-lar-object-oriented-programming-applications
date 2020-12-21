package com.yazilim;
public class Ev {
	protected void Bilgisayar() {
		System.out.println("bilgisayar geldi");
	}
	protected String cumle="merhaba dunya";
	private void kasa() {
		System.out.println("kasaya erişildi");
	}
	public  void Adres() {
		System.out.println("adres degeri girildi");
	}
	public int sayi1=67;
	
	 int sayi=5;
    private  String belge="Belgeye ulaşıldı";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ev anne=new Ev();
		 Ev halk=new Ev();
		 anne.kasa();
		 System.out.println(anne.belge);
          System.out.println(anne.sayi);
         String  d=anne.cumle;
         System.out.println(d);
         anne.Bilgisayar();
         halk.Adres();
         int d2 = halk.sayi1;
         System.out.println(d2);
         
         
	}

}
