import java.util.Scanner;

public class numberAbsoluteValueTask1 {
    public static void main(String args[]) {
        int numberAbsoluteValue;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        numberAbsoluteValue = input.nextInt();
        System.out.println(Math.abs(numberAbsoluteValue));

    }
}
