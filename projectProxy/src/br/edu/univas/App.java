package br.edu.univas;

public class App {

	public static void main(String[] args) {
		Student student1 = new ProxyStudent(1, "Bruno");
		
		student1.student();

	}

}
