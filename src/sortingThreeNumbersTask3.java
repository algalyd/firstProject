import java.util.ArrayList;
import java.util.*;

public class sortingThreeNumbersTask3 {
    public static void main(String args[]){
        float firstSortedNumber;
        float secondSortedNumber;
        float thirdSortedNumber;
        int counter;

        List<Float> sortedNumbers = new ArrayList<Float>();

        Scanner number = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstSortedNumber = number.nextFloat();

        System.out.println("Enter second number: ");
        secondSortedNumber = number.nextFloat();

        System.out.println("Enter third number: ");
        thirdSortedNumber = number.nextFloat();


        sortedNumbers.add(firstSortedNumber);
        sortedNumbers.add(secondSortedNumber);
        sortedNumbers.add(thirdSortedNumber);

        Collections.sort(sortedNumbers);

        for (counter = 0; counter < 3; counter++) {
            System.out.println(sortedNumbers.get(counter));
        }
    }
}
