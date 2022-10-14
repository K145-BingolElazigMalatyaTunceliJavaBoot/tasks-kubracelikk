package Greengrocer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//güncellenecek
		Manager manager = new Manager();

		Apple apple = new Apple();
		Pear pear = new Pear();
		Cherry cherry = new Cherry();

		manager.add(apple, 15);
		manager.add(cherry, 40);
		manager.add(pear, 10);


		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("lütfen almak istediğiniz meyveyi yazınız");
			String meyve = sc.nextLine();
			System.out.println("lütfen almak istediğiniz meyvenin kilosunu yazınız");
			apple.setKg(sc.nextInt());
			int sonuc = apple.calculatePrice();
			System.out.println(meyve + " için ödemeniz gereken ücret: " + sonuc + "TL");
		}
	
//		 cherry.setKg(sc.nextInt());
//		 int sonuc2 = cherry.calculatePrice();
//		 System.out.println("Ödemeniz gereken ücret: " +sonuc2+ "TL");
	}
}
