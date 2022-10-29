package carRental;

import java.util.List;
import java.util.Scanner;

public class RentACarClient {

	public static void main(String[] args) {
		try (Scanner k = new Scanner(System.in)) {
			while(true) {
				System.out.println("Lütfen müşterinin tipini seçiniz");
				String customerType=k.next();
				RentACarService rentACarService=null;
				if("Corporate".equals(customerType)) {
				rentACarService=new RentACarService();
					
				} else if("Individual".equals(customerType)){
				rentACarService=new RentACarService(new Individual());	
				
			} showCars(rentACarService); 
			
}
		} }

	public static void showCars(RentACarService rentACarService) {
		List<Car> carList = rentACarService.getCarList(); // burayı metot şeklinde de yapabiliriz
		for (Car car : carList) {
			System.out.println("Marka " + car.getMarka());
		}
	}
} 

