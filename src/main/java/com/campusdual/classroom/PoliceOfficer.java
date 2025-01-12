package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails(){
		StringBuilder police = new StringBuilder();

		police.append("policia ");
		police.append(this.name);
		police.append(" ");
		police.append(this.surname);
		police.append(" cuya squad es: ");
		police.append(this.squad);

		System.out.println(police.toString());
	}
}
