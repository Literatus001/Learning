package ua.com.foxminded.carmanager;

public class Motocycle {
	Color color;
	String name;
	int yearOfProduction;
	int prise;
	int weight;
	String engineType;
	String color3;
	String color2;
	boolean isReadyToDrive;
	
	public Motocycle(String name, int yearOfProduction, int prise, int weight, String color1, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.prise = prise;
		this.weight = weight;
		this.engineType = engineType;
		color1 = color1.replace(" ","");
		String color2 = color1.toUpperCase();
		this.color2 = color2;
//		this.color3 = color2
		this.color = Color.valueOf(color2);
		this.isReadyToDrive = isReadyToDrive;
		
		}

	@Override
	public String toString() {
		color3 = color2.toLowerCase();
		String color4 = color3.substring(0, 1).toUpperCase() + color3.substring(1);
//		System.out.println();
		return "Motocycle [color=" + color4 + ", name=" + name + ", yearOfProduction=" + yearOfProduction + ", prise="
				+ prise + ", weight=" + weight + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ "]";
	}
	
}

