package exercise1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
	private int correctAnswers;
    private int incorrectAnswers;
    // Method to initiate the test
    public void inputAnswer() {
    	// Simulate questions and handle user input
        simulateQuestion("What is the extension of Java File?", "A. .xml", "B. .php", "C. .html", "D. .java", "D");
        simulateQuestion("Which class is responsible for execution of program?", "A. Parent Class", "B. Child Class", "C. Driver Class", "D. None of the above", "C");
        simulateQuestion("Does the constructor have return type?", "A. Yes", "B. No", "C. Some constructors have", "D. Don't Know", "B");
        simulateQuestion("The methods defined in Math Class are used to perform which Operations?", "A. Mathematical operations", "B. Repeat code", "C. Increase complexity", "D. Print messages", "A");
        simulateQuestion("Which data type is used to store decimal numbers in Java?", "A. int", "B. double", "C. char", "D. boolean", "B");

        displayResults();
    }

    private void simulateQuestion(String question, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        String userAnswer = JOptionPane.showInputDialog(null, question + "\n" + optionA + "\n" + optionB + "\n" + optionC + "\n" + optionD);
        // Check user's answer and display appropriate message
        if (checkAnswer(userAnswer, correctAnswer)) {
            JOptionPane.showMessageDialog(null, generateMessage(true));
            correctAnswers++;
        } else {
            JOptionPane.showMessageDialog(null, generateMessage(false, correctAnswer));
            incorrectAnswers++;
        }
    }

    private boolean checkAnswer(String userAnswer, String correctAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
    // Method to generate a positive response for correct answer
    private String generateMessage(boolean isCorrect) {
        String[] messages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        Random randomObject = new Random();
        return messages[randomObject.nextInt(4)];
    }
    // Method to generate a corrective message with the correct answer
    private String generateMessage(boolean isCorrect, String correctAnswer) {
        String[] messages = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying.."};
        Random randomObject = new Random();
        return messages[randomObject.nextInt(4)] + "\nThe correct answer is: " + correctAnswer;
    }
    // Method to display test results
    private void displayResults() {
        double percentage = (double) correctAnswers / (correctAnswers + incorrectAnswers) * 100;
        JOptionPane.showMessageDialog(null, "Test Results:\nCorrect Answers: " + correctAnswers +
                "\nIncorrect Answers: " + incorrectAnswers +
                "\nPercentage: " + String.format("%.2f%%", percentage));
    }
    // Main method to start the test
    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
    }
