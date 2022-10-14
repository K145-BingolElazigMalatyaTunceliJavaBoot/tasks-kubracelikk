package TicketCompany;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//güncellenecek
		Pegasus pegasus = new Pegasus();
		pegasus.getName();

		THY thy = new THY();
		thy.getName();

		List<String> pegasusSeat = new ArrayList<String>();
		pegasusSeat.add("A2");
		List<String> thySeat = new ArrayList<String>();
		thySeat.add("B2");

		Traveller traveller = new Traveller();
		traveller.setNameSurname("Kübra Çelik");

	}

}
