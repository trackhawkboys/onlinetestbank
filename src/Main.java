
// Main class that starts the program
public class Main {

    public static void main(String[] args) {

        // Create a student object
        Student student = new Student("Denzel", 1001);

        // Create the online test
        OnlineTestApp test = new OnlineTestApp("Java Basics Test");

        // Create questions
        Question q1 = new Question(
                "What keyword is used to refer to a parent class?",
                "super"
        );

        Question q2 = new Question(
                "Which OOP concept allows a class to inherit from another class?",
                "inheritance"
        );

        // Add questions to the test
        test.addQuestion(q1);
        test.addQuestion(q2);

        // Display test and student information
        test.displayTestInfo();
        student.displayInfo();

        // Start the test
        test.takeTest(student);

        // Display final score
        test.displayScore();
    }
}



