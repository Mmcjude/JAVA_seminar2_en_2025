package model;

public class Professor {
    // 1. Variables
    private long pId;
    private String name;
    private String surname;
    private Degree degree;
    
    private static long counter = 10000;
    
    // 2. Getters
    public long getpId() {
        return pId;
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
    
    // 3. Setters
    public void setPID() {
        pId = counter;
        counter++;
    }
    
    public void setName(String inputName) {
        if (inputName != null && inputName.matches("[A-Z]{1}[a-z]{3,15}")) {
            name = inputName;
        } else {
            name = "No name";
        }
    }
    
    public void setSurname(String inputSurname) {
        if (inputSurname != null && inputSurname.matches("[A-Z]{1}[a-z]{3,30}")) {
            surname = inputSurname;
        } else {
            surname = "No surname";
        }
    }
    
    public void setDegree(Degree inputDegree) {
        if (inputDegree != null) {
            degree = inputDegree;
        } else {
            degree = Degree.dr;
        }
    }

    // 4. Default Constructor
    public Professor() {
        setPID();
        setName("Test");
        setSurname("Test");
        setDegree(Degree.mg);
    }
    
    // 5. Argument Constructor
    public Professor(String inputName, String inputSurname, Degree inputDegree) {
        setPID();
        setName(inputName);
        setSurname(inputSurname);
        setDegree(inputDegree);
    }
    
    // 6. toString Function
    @Override
    public String toString() {
        return pId + ": " + name + " " + surname + " (" + degree + ")";
    }
}
