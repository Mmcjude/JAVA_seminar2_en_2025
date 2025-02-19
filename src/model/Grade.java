package model;

public class Grade {
    // Variables
    private long gID;
    private String name;

    private static long counter = 5000; // 

    // Default Constructor
    public Grade() {
        this.gID = ++counter;
        this.name = "No grade";
    }

    // Parameterized Constructor
    public Grade(String name) {
        this.gID = ++counter;
        setName(name);
    }// Invalid name

    // Getters and Setters
    public long getgID() {
        return gID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[A-F]{1}[+-]?$")) { 
            this.name = name;
        } else {
            this.name = "Invalid Grade";
        }
    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        Grade.counter = counter;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Grade ID: " + gID + ", Grade: " + name;
    }
}
