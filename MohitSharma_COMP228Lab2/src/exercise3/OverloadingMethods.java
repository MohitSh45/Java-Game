package exercise3;


public class OverloadingMethods {
	public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

public static void main(String[] args) {
	System.out.println("Sum of 7 and 5: " + OverloadingMethods.sum(7, 5));
    System.out.println("Sum of 7.5, 3.5, and 5.5: " + OverloadingMethods.sum(7.5, 3.5, 5.5));
    System.out.println("Concatenated string: " + OverloadingMethods.concatenateStrings("Jesus ", "Christ!"));

  
}
}