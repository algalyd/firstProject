import java.util.Scanner;

public class asterisksBuildingMakerTask8 {
    public static void main(String args[]) {
        int asterisksNumber;

        asterisksNumber = userInputNumberAsterisksBuilding();
        asterBuildingSizeCalculator(asterisksNumber);
    }

    public static int userInputNumberAsterisksBuilding(){
        int asterisksNumber;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter number between 5 - 20: ");
            asterisksNumber = input.nextInt();

        } while (asterisksNumber<5 || asterisksNumber>20);
        return asterisksNumber;
    }

    public static void asterBuildingSizeCalculator(int asterisksNumber) {
        int counter;

        String asterisksLines = "";

        for (counter = 0; counter < asterisksNumber; counter++) {

            asterisksLines = asterisksLines +"*";
            System.out.println(asterisksLines);
        }
    }
}
