package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails(){
		StringBuilder doctor = new StringBuilder();

		doctor.append("Doctor ");
		doctor.append(this.name);
		doctor.append(" ");
		doctor.append(this.surname);
		doctor.append(" cuya especializacion es: ");
		doctor.append(this.specialization);

		System.out.println(doctor.toString());
	}
}
