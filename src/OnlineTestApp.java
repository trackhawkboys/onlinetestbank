import java.util.Scanner;

// Class that manages the online test
public class OnlineTestApp {

    private String testTitle;
    private Question[] questions;
    private int questionCount; // tracks how many questions are actually used
    private int score;

    // Constructor
    public OnlineTestApp(String testTitle) {
        this.testTitle = testTitle;
        this.questions = new Question[2]; // fixed size array
        this.questionCount = 0;
        this.score = 0;
    }

    // Adds a question to the test
    public void addQuestion(Question question) {
        if (questionCount < questions.length) {
            questions[questionCount] = question;
            questionCount++;
        } else {
            System.out.println("Test is full! Cannot add more questions.");
        }
    }

    // Displays test information
    public void displayTestInfo() {
        System.out.println("\n=== " + testTitle + " ===");
        System.out.println("Number of Questions: " + questionCount);
        System.out.println();
    }

    // Allows the student to take the test
    public void takeTest(Student student) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questionCount; i++) {

            System.out.println("Question " + (i + 1) + ":");
            questions[i].displayQuestion();

            System.out.print("Your answer: ");
            String answer = input.nextLine();

            // Check if the answer is correct
            if (questions[i].checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.");
                System.out.println("Correct Answer: "
                        + questions[i].getCorrectAnswer() + "\n");
            }
        }

        // Increase student's test count
        student.incrementTestsTaken();
    }

    // Displays the final score
    public void displayScore() {
        System.out.println("Final Score: " + score + "/" + questionCount);
    }
}
