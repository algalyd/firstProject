import java.util.Scanner;

public class twoNumbersSumOddOrEvenCheckerTask2 {
    public static void main(String[] args) {
        float oddOrEvenFirstNumber;
        float oddOrEvenSecondNumber;
        float numbersSum;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        oddOrEvenFirstNumber = number.nextFloat();

        System.out.println("Enter the second number: ");
        oddOrEvenSecondNumber = number.nextFloat();

        numbersSum = oddOrEvenFirstNumber + oddOrEvenSecondNumber;


        if (numbersSum % 2 == 0 ) {
            System.out.println("The sum of these two numbers is even number");
        }
        else {
            System.out.println("The sum of these two numbers is odd number");
        }
    }
}
