package Greengrocer;

public class Cherry extends Fruit {
	
	 public Cherry() {
	 
		setName("Kiraz");
	}

	 @Override
		public int calculatePrice() {
			int weightPrice = 10;
			int price = kg * weightPrice;
			return price;
		}

}
