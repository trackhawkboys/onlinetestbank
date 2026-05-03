import java.util.ArrayList;
import java.util.Scanner;

class OnlineTest {
    private String testName;
    private ArrayList<Question> questions;
    private int score;

    public OnlineTest(String testName) {
        this.testName = testName;
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void displayTestInfo() {
        System.out.println("Test Name: " + testName);
        System.out.println("Number of Questions: " + questions.size());
    }

    public void takeTest() {
        Scanner input = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();

            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
                System.out.println("Correct answer: " + question.getCorrectAnswer());
            }

            System.out.println();
        }
    }

    public void displayScore() {
        System.out.println("Final Score: " + score + "/" + questions.size());
    }
}