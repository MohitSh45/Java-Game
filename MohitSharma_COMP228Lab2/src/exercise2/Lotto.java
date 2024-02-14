package exercise2;
import java.util.Random;

import javax.swing.JOptionPane;
public class Lotto {

	private int[] lottoNumbers;

    // Constructor to randomly populate the array
    public Lotto() {
        lottoNumbers = new int[3];
        populateArray();
    }

    // Method to populate the array with random numbers (1 to 9)
    private void populateArray() {
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1;
        }
    }

    // Method to return the lotto numbers array
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    // Method to simulate the lotto game
    public void playGame() {
        int userNumber;
        int userAttempts = 0;

        while (userAttempts < 5) {
            userNumber = getUserNumber();

            // Check if user wins
            if (checkWin(userNumber)) {
                displayWinMessage();
                return;
            }

            userAttempts++;
        }

        displayComputerWinMessage();
    }

    // Method to get the user's chosen number
    private int getUserNumber() {
        String input = JOptionPane.showInputDialog(null, "Choose a number between 3 and 27:");
        return Integer.parseInt(input);
    }

    // Method to check if the user wins
    private boolean checkWin(int userNumber) {
        int sum = calculateSum();

        return userNumber == sum;
    }

    // Method to calculate the sum of lotto numbers
    private int calculateSum() {
        int sum = 0;
        for (int number : lottoNumbers) {
            sum += number;
        }
        return sum;
    }

    // Method to display win message
    private void displayWinMessage() {
        JOptionPane.showMessageDialog(null, "Congratulations! You've won!");
    }

    // Method to display computer win message
    private void displayComputerWinMessage() {
        JOptionPane.showMessageDialog(null, "Sorry, you didn't win. Better luck next time!");
    }

    // Main method to run the lotto game
    public static void main(String[] args) {
        Lotto lottoGame = new Lotto();
        lottoGame.playGame();
    }    }

