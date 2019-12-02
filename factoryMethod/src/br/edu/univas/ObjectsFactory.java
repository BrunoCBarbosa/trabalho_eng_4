package br.edu.univas;

public class ObjectsFactory {
	Objects getObjects(String type, String color) {
		if(type == "Square" || type == "square") {
			return new Square(color);
		}else if(type == "Triangle" || type == "triangle") {
			return new Triangle(color);
		}else {
			return null;
		}	
	}
}
