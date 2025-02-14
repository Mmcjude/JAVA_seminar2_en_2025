package model;

public class Student {
    // 1. Variables
    private long stID;
    private String name;
    private String surname;

    private static long counter = 0;

    // 2. Default Constructor
    public Student() {
        this.stID = ++counter; // Assign a unique ID
        setName("Test");
        setSurname("Test");
    }

    // 3. Parameterized Constructor
    public Student(long stID, String name, String surname) {
        this.stID = stID;
        setName(name);
        setSurname(surname);
    }

    public Student(String surname) {
        this.stID = ++counter;
        setName("Default");
        setSurname(surname);
    }

    // 4. Getters
    public long getStID() {
        return stID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // 5. Setters
    public void setStID(long stID) {
        this.stID = stID;
    }

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
}
