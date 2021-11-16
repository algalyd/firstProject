import java.util.Scanner;

public class arithmeticSequenceMakerTask6 {
    public static void main(String args[]) {
        float firstTerm;
        float differenceBetweenTerms;
        float numberOfTerms;
        int numberOfTermsInt;

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first term of the arithmetic sequence: ");
        firstTerm = number.nextFloat();

        System.out.println("Enter the difference between the following terms in the arithmetic sequence: ");
        differenceBetweenTerms = number.nextFloat();

        System.out.println("Enter the number of terms in the arithmetic sequence: ");
        numberOfTerms = number.nextFloat();
        numberOfTermsInt = (int)numberOfTerms;

        if (numberOfTerms > 0 && numberOfTermsInt == numberOfTerms) {
            arithmeticSequenceCalculator(firstTerm, differenceBetweenTerms, numberOfTermsInt );
        }
        else {
            System.out.println("You have to enter a positive whole number as number of terms");
        }
    }

    public static void arithmeticSequenceCalculator(float firstTerm, float differenceBetweenTerms, int numberOfTermsInt ) {
        float currentTerm;
        int counter;

        currentTerm = firstTerm;
        System.out.println("Requested arithmetic sequence: ");
        System.out.println(firstTerm);

        for (counter = 0; counter < (numberOfTermsInt-1); counter++) {
            currentTerm = currentTerm + differenceBetweenTerms;
            System.out.println(currentTerm);
        }
    }
}
