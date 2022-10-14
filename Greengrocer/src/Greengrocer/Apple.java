package Greengrocer;

public class Apple extends Fruit {
	public Apple() {
		setName("Elma");
	}

	@Override
	public int calculatePrice() {
		int weightPrice = 5;
		int price = kg * weightPrice;
		return price;
	}

}
