package Greengrocer;

public class Pear extends Fruit {

	public Pear() {
		setName("Armut");
	}
	
	@Override
	public int calculatePrice() {
		int weightPrice = 7;
		int price = kg * weightPrice;
		return price;
	}
	

}
