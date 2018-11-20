package data;

public class Student {
	private String prename;
	private String surname;
	private int matriculationNumber;
	private int course;

	public Student(String prename, String surname, int matriculationNumber, int course) {
		super();
		this.prename = prename;
		this.surname = surname;
		this.matriculationNumber = matriculationNumber;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [prename=" + prename + ", surname=" + surname + ", matriculationNumber=" + matriculationNumber
				+ ", course=" + course + "]";
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}
