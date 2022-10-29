package carRental;

import java.util.ArrayList;
import java.util.List;

public class RentACarService {

	private Customer customer;
	static List<Car> carList;

	public RentACarService(Customer customer) {
		this();
		this.customer = customer;

	}

	public RentACarService() {
		createCarRepo();
	}

	public List<Car> getCarList() {
		List<Car> carListCustomerType = new ArrayList<>();
		for (Car car : carList) {
     if(customer instanceof Individual) {
    	 if(car instanceof Hatchback) {
    		 carListCustomerType.add(car);
    	 }
     } else {
    	 carListCustomerType.add(car);
     }
		}
		return carListCustomerType;
	}

	public void createCarRepo() {
		carList = new ArrayList<>();

		SUV suv = new SUV();
		suv.setMarka("Kia Sportage");
		SUV suv2 = new SUV();
		suv2.setMarka("Citroen C5 Aircross");

		Sedan sedan = new Sedan();
		sedan.setMarka("BMW");
		Sedan sedan2 = new Sedan();
		sedan2.setMarka("Jeep");

		Hatchback hatchback = new Hatchback();
		hatchback.setMarka("Volkswagen");
		Hatchback hatchback2 = new Hatchback();
		hatchback2.setMarka("Audi A3");

		carList.add(suv);
		carList.add(suv2);
		carList.add(sedan);
		carList.add(sedan2);
		carList.add(hatchback);
		carList.add(hatchback2);

	}
}
