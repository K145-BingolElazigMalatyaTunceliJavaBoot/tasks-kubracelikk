package carRental;

public abstract class Car {
	private int luggage;
	private String color;
	private String marka;
	
	public abstract void monthlyRental();
	
	public int getLuggage() {
		return luggage;
	}
	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String model) {
		this.marka = model;
	}

	
}
