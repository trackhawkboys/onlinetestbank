import java.util.Scanner;

public class OnlineTestApp {
    public static void main(String[] args) {

        Question[] questions = new Question[2];

        questions[0] = new Question("Which OOP concept allows a class to inherit from another class?", "inheritance");
        questions[1] = new Question("What keyword is used for inheritance?", "super");

        Scanner input = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            questions[i].displayQuestion();

            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (questions[i].checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }

            System.out.println();
        }

        System.out.println("Final Score: " + score + "/" + questions.length);
    }
}

class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}