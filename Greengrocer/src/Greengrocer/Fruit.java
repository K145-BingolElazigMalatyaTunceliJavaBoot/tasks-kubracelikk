package Greengrocer;

public abstract class Fruit {
	protected int kg; //kullanıcıdan
	private String name;
	private int weightPrice;
	private int stock;
	
	
	public int calculatePrice() {
		int price=getKg()*getWeightPrice();
		return price;
	}
	
	
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getWeightPrice() {
		return weightPrice;
	}

	public void setWeightPrice(int weightPrice) {
		this.weightPrice = weightPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	
	
}
