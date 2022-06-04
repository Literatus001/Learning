package ua.com.foxminded.carmanager;

public enum Color {
	BLACK ("Black"),

	ORANGE ("Orange"),

	WHITE ("White"),

	YELLOW ("Yellow"),

	BLUE ("Blue"),

	GREEN ("Green");
	
Color(String color) {
	this.color = color;
	
}
String color;
public String getColor() 
{	
return color;
}

}


