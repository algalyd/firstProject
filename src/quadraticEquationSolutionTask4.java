import java.util.Scanner;

public class quadraticEquationSolutionTask4 {
    public static void main(String[] args) {
        double aValueInput;
        double bValueInput;
        double cValueInput;
        double quadraticEquationCalculate1;
        double quadraticEquationCalculate2;
        double quadraticEquationCalculate3;
        double quadraticEquationCalculate4;
        double quadraticEquationFirstSolution;
        double quadraticEquationSecondSolution;


        Scanner abc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        aValueInput = abc.nextDouble();

        System.out.println("Enter b value: ");
        bValueInput = abc.nextDouble();

        System.out.println("Enter c value: ");
        cValueInput = abc.nextDouble();


        quadraticEquationCalculate1 = bValueInput * bValueInput;
        quadraticEquationCalculate2 = (-4) * aValueInput * cValueInput;
        quadraticEquationCalculate3 = quadraticEquationCalculate1 + quadraticEquationCalculate2;
        quadraticEquationCalculate4 = Math.sqrt(quadraticEquationCalculate3);

        quadraticEquationFirstSolution = ((-bValueInput) + quadraticEquationCalculate4) / (2 * aValueInput);
        quadraticEquationSecondSolution = ((-bValueInput) - quadraticEquationCalculate4) / (2 * aValueInput);


        if (quadraticEquationFirstSolution == quadraticEquationSecondSolution) {
            System.out.println("There is only one solution for this quadratic equation: X = " + quadraticEquationFirstSolution);
        }
        else if ((Double.isNaN(quadraticEquationFirstSolution) != true) & (Double.isNaN(quadraticEquationSecondSolution) != true)) {
            System.out.println("There is two solutions for this quadratic equation: X1 = " + quadraticEquationFirstSolution + " and X2 = " + quadraticEquationSecondSolution);
        }
        else {
            System.out.println("There is no solution for this quadratic equation");
        }
    }
}
