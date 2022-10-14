package Greengrocer;

import java.util.Scanner;

public class Manager {
	  public void add(Fruit fruit, int kg) {
	        fruit.setKg(kg);
	    }

	    public void buyFruit(Fruit fruit)  {
	    	int kg;
	    	try (Scanner k = new Scanner(System.in)) {
				kg=k.nextInt();
			}
	    	if (fruit.getKg() < kg) {
	            System.out.println("Malesef elmizde " + kg + " kilogram " + fruit.getName() + " yok");
	        } else {
	            System.out.println(kg + " kg " + fruit.getName() + " alındı");
	        }
	    }
}
