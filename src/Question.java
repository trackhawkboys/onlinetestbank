// Class that represents a test question
public class Question {

    private String questionText;
    private String correctAnswer;

    // Constructor
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    // Displays the question
    public void displayQuestion() {
        System.out.println(questionText);
    }

    // Checks if the user's answer is correct
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }

    // Returns the correct answer
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

