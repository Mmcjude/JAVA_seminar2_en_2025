package model;

public class Course {
	// 1. variables
	private long cID;
	private String title;
	private int creditPoint;
	private Professor professor;

	private static long counter = 20000;

	// 2. getters
	public long getcID() {
		return cID;
	}

	public String getTitle() {
		return title;
	}

	public int getCreditPoint() {
		return creditPoint;
	}

	public Professor getProfessor() {
		return professor;
	}

	// 3. setters
	public void setcID() {
		cID = counter;
		counter++;
	}

	public void setTitle(String inputTitle) {
		if (inputTitle != null && inputTitle.matches("[A-Z]{1}[a-zA-Z ]{2,30}")) {
			title = inputTitle;
		} else {
			title = "No title";
		}
	}

	public void setCreditPoint(int inputCreditPoint) {
		if (inputCreditPoint > 0 && inputCreditPoint <= 30) {
			creditPoint = inputCreditPoint;
		} else {
			creditPoint = 0;
		}
	}

	public void setProfessor(Professor inputProfessor) {
		professor = (inputProfessor != null) ? inputProfessor : new Professor("Unknown", "Professor", Degree.bsc);
	}

	// 4. default constructor
	public Course() {
		setcID();
		setTitle("Test Course");
		setCreditPoint(0);
		setProfessor(new Professor("Test", "Professor", Degree.dr));
	}

	// 5. argument constructor
	public Course(String inputTitle, int inputCreditPoint, Professor inputProfessor) {
		setcID();
		setTitle(inputTitle);
		setCreditPoint(inputCreditPoint);
		setProfessor(inputProfessor);
	}

	// 6. toString function
	public String toString() {
		return cID + ": " + title + " (" + creditPoint + " CP), Professor: " +
		       (professor != null ? professor.getName() + " " + professor.getSurname() : "No professor assigned");
	}
}
