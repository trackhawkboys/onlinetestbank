// Student class that inherits from Person
public class Student extends Person {

    private int testsTaken;

    // Constructor
    public Student(String name, int id) {
        super(name, id);
        this.testsTaken = 0;
    }

    // Increases the number of tests taken
    public void incrementTestsTaken() {
        testsTaken++;
    }

    // Returns the number of tests taken
    public int getTestsTaken() {
        return testsTaken;
    }

    // Displays student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tests Taken: " + testsTaken);
    }
}