package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
		
		
		Car renaut = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
//		Motocycle suzuki = new Motocycle("Suzuki GSX-R1000", 2021, 16000, 600, "BLACK", "diesel", true);
//		
//		Motocycle yamaha = new Motocycle("Yamaha FZ1", 2007, 9000, 700, "ORANGE", "gas", false);
		
		Motocycle suzuki = new Motocycle("Suzuki GSX-R1000", 2021, 16000, 600, "black ", "diesel", true);
		
		Motocycle yamaha = new Motocycle("Yamaha FZ1", 2007, 9000, 700, "orangE ", "gas", false);
		
//		System.out.println(prius);
//		
//		System.out.println(renaut);
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
	}
}
 