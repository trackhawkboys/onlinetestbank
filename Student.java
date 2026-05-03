class Student extends Person {
    private int testsTaken;

    public Student(String name, int id) {
        super(name, id);
        this.testsTaken = 0;
    }

    public void incrementTestsTaken() {
        testsTaken++;
    }

    public int getTestsTaken() {
        return testsTaken;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tests Taken: " + testsTaken);
    }
}
