package ucuncuSoru;

public class Main {

	public static void main(String[] args) {
		int toplam = 0;
		for (int sayi = 200; sayi < 500; sayi++) {
			if (sayi % 3 != 0)
				toplam = toplam + sayi;
		}
		System.out.println("3 ile bölünmeyen sayıların toplamı = " + toplam);
	}

}
