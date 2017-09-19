package cz.fi.muni;

public class Corpse {

	private String firstName;
	private String lastName;
	private int ageDied;
	private int yearDied;

	public Corpse(String firstName, String lastName, int ageDied, int yearDied) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ageDied = ageDied;
		this.yearDied = yearDied;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAgeDied() {
		return ageDied;
	}

	public void setAgeDied(int ageDied) {
		this.ageDied = ageDied;
	}

	public int getYearDied() {
		return yearDied;
	}

	public void setYearDied(int yearDied) {
		this.yearDied = yearDied;
	}

}
