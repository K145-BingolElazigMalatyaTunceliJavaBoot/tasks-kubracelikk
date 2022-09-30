
public class Hatchback extends Car {

	public int aylıkKirala () {
		System.out.println("Hatchback aylık olarak kiralanamaz");
		return 1;
	}
	public int gunlukKirala(int gunUcreti) {
		return gunUcreti;
	}
}
