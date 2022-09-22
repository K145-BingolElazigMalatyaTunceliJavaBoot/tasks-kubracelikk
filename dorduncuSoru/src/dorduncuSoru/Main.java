package dorduncuSoru;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		 //0 ile 500 aralığında ve Bu sayılardan 50 ile 100 arasında bir sayı bulunana
		 // kadar rastgele sayılar seçilir. 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program
		  
		 
		int sayi = 0;
		int sayac = 0;
		Random rand = new Random();
		while (sayi < 50 || sayi > 100) {
			sayi = rand.nextInt(500);
			sayac++;
		}
		System.out.println(sayi + " Sayısı kaçıncı seçimde bulundu : " + sayac);
	}

}
