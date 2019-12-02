package br.edu.univas;

public class FindStudent implements Student {
	
	private int registration;
	private String name;
	
	FindStudent(int registration, String name){
		this.registration = registration;
		this.name = name;
		getStudent();
	}

	@Override
	public void student() {
		System.out.println("Estudante " + this.registration + " encontrado. Nome: " + this.name);
		
	}
	
	void getStudent() {
		System.out.println("Procurando estudante: " + this.registration);
	}
	
}
