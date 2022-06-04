package ua.com.foxminded.carmanager;

public class Car {
		String name;
		int yearOfProduction;
		int prise;
		int weight;
		Color color;
		
		public Car(String name, int yearOfProduction, int prise, int weight, Color color) {
			this.name = name;
			this.yearOfProduction = yearOfProduction;
			this.prise = prise;
			this.weight = weight;
			this.color = color;
			
			
		}

	
		public String toString() {
			return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", prise=" + prise + ", weight="
					+ weight + ", color=" + color + "]";
		}

		
		
		
}
