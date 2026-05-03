public class Main {
    public static void main(String[] args) {

        Student student = new Student("Denzel", 1001);

        OnlineTest test = new OnlineTest("Java Basics Test");

        Question q1 = new Question(
            "What keyword is used to refer to a parent class?",
            "Extends"
        );

        Question q2 = new Question(
            "Which OOP concept allows a class to inherit from another class?",
            "inheritance"
        );

        test.addQuestion(q1);
        test.addQuestion(q2);

        test.displayTestInfo();

        student.displayInfo();

        // Later you can add Scanner input here
        test.takeTest();
        test.displayScore();
    }
}
