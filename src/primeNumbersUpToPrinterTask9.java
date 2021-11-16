import java.util.Scanner;

public class primeNumbersUpToPrinterTask9 {
    public static void main(String args[]) {
        float positiveNumberValue;
        int counter;

        positiveNumberValue = positiveNumberInputChecker();
        for (counter = 1; counter < (positiveNumberValue); counter++) {
            if (primeNumberChecker(counter) == true){System.out.println(counter);}
        }
    }



    public static boolean remainderOfDivisionChecker(int divisionNumber1, int divisionNumber2) {
        boolean totalDivisionScore;
        float dividingValue;

        dividingValue = divisionNumber1 % divisionNumber2;
        if (dividingValue == 0) {
            totalDivisionScore = true;
        } else totalDivisionScore = false;

        return totalDivisionScore;
    }


    public static boolean primeNumberChecker(int testedPrimeNumber) {
        boolean primeTesterScore = true;
        int counter;

        for (counter = 2; counter < (testedPrimeNumber); counter++) {
            if (remainderOfDivisionChecker(testedPrimeNumber, counter) == true) {
                primeTesterScore = false;
            }
        }
        return primeTesterScore;
    }


    public static float positiveNumberInputChecker() {
        float positiveNumber;

        do {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter positive number: ");
            positiveNumber = number.nextFloat();
        } while (positiveNumber <= 0);

        return positiveNumber;
    }
}
