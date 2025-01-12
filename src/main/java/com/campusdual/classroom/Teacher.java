package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails() {
		StringBuilder teacher = new StringBuilder();

		teacher.append("Profesora ");
		teacher.append(" ");
		teacher.append(this.name);
		teacher.append(" ");
		teacher.append(this.surname);
		teacher.append(" cuya area es: " + this.area);

		System.out.println(teacher.toString());
	}
}

