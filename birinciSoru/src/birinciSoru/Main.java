package birinciSoru;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.println("Lütfen puanınızı giriniz");
		int puan = k.nextInt();
		
		if(puan>70 && puan<100) {
			System.out.println("AA");
		} else if (puan>50 && puan<70) {
			System.out.println("BB");
		} else if (puan>35 && puan<50) {
			System.out.println("DC");
		} else if (puan>0 && puan<35) {
			System.out.println("FF");
		} else {
			System.out.println("GEÇERSİZ PUAN GİRDİNİZ");
		}
		

	}

}
