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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corpse other = (Corpse) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", died in " + yearDied + " at the age of " + ageDied + ".";
	}

}
