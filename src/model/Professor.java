package model;

public class Professor {
    // Variables
    private long pID;
    private String name;
    private String surname;
    private Degree degree;

    private static long counter = 0;

    // Default Constructor
    public Professor() {
        this.pID = ++counter;
        setName("Test");
        setSurname("Test");
        setDegree(Degree.other);
    }

    // Constructor
    public Professor(long pID, String name, String surname, Degree degree) {
        this.pID = pID;
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

    public Professor(String surname) {
        this.pID = ++counter;
        setName("Default");
        setSurname(surname);
        setDegree(Degree.other);
    }

    // Getters
    public long getpID() {
        return pID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Degree getDegree() {
        return degree;
    }

    // Setters
    public void setName(String inputName) {
        if (inputName != null && inputName.matches("^[A-Z][a-z]{2,14}$")) {
            this.name = inputName;
        } else {
            this.name = "No name";
        }
    }

    public void setSurname(String inputSurname) {
        if (inputSurname != null && inputSurname.matches("^[A-Z][a-z]{2,29}$")) {
            this.surname = inputSurname;
        } else {
            this.surname = "No surname";
        }
    }

    public void setDegree(Degree degree) {
        this.degree = (degree != null) ? degree : Degree.other;
    }
}
