package br.edu.univas;

public class ProxyStudent implements Student {
	private FindStudent student;
	private int registration;
	private String name;
	
	ProxyStudent(int registration, String name){
		this.registration = registration;
		this.name = name;
	}

	@Override
	public void student() {
		if(studentExists()) {
			student = new FindStudent(registration,name);
			student.student();
		}
		
	}
	
	private boolean studentExists() {
		return name == "Bruno";
	}
}
