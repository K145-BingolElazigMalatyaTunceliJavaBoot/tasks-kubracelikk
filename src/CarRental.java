
public class CarRental {

	public static void main(String[] args) {
		Suv suv = new Suv();
		Sedan sedan = new Sedan();
		Hatchback hatchback = new Hatchback();		
		
		//Suv
		suv.getId();
		suv.setRenk("Mavi");
		suv.setYas(2);
		suv.setBagajkapasitesi(100);
		int suvHesap = suv.aylıkKirala(20, 15, 2);
		System.out.println(suvHesap);
		
		
		//Sedan
		sedan.getId();
		sedan.setRenk("Sarı");
	    sedan.setYas(1);
	    sedan.setBagajkapasitesi(200);
	    int sedanHesap= sedan.aylıkKirala(300, 30);
	    System.out.println(sedanHesap);
	    
	    //Hatchback
	    hatchback.getId();
	    hatchback.setRenk("Siyah");
	    hatchback.setYas(3);
	    hatchback.setBagajkapasitesi(300);
	    int hatchbackHesap = hatchback.aylıkKirala();
	    System.out.println(hatchbackHesap);
	    
	   
	}

}
