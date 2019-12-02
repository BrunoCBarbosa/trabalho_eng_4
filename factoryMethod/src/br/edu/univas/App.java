package br.edu.univas;

public class App {
	public static void main(String args[]){
		ObjectsFactory factory = new ObjectsFactory();
		
		factory.getObjects("triangle", "blue");
	}
}
