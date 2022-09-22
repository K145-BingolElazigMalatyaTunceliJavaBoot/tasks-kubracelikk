package ikinciSoru;

public class Main {

	public static void main(String[] args) {
		int toplam = 0;
		for (int sayi = 3; sayi < 100; sayi++) {
			int sayac = 0;
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					sayac++;
					break;
				}
			}
			if (sayac == 0) {
				toplam = toplam + sayi;
			}
		}
		System.out.println("Asal sayıların toplamı = " + toplam);

	}

}
