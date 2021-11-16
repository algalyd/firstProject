import java.util.Scanner;

public class employeeSalaryCalculatorTask5 {
    public static void main(String args[]) {
        int employeeType;
        int workingHours;
        int dailyTarget;
        int employeeTotalSalary;
        char toContinueOrStop;

        do {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter employee type (enter 0 for junior or 1 for senior): ");
            employeeType = number.nextInt();

            System.out.println("Enter employee sum working hours for this month: ");
            workingHours = number.nextInt();

            System.out.println("Enter the number of days that the employee has reached his daily target: ");
            dailyTarget = number.nextInt();

            employeeTotalSalary = salaryCalculator(employeeType, workingHours, dailyTarget);
            System.out.println("employee total salary for this month: " + employeeTotalSalary);

            Scanner answer = new Scanner(System.in);
            System.out.println("Do you want to calculate another employee salary? for yes type \'y\', for no type \'n\'");
            toContinueOrStop = answer.next().charAt(0);

        } while (toContinueOrStop == 'y');
    }


    public static int salaryCalculator(int employeeType, int workingHours, int dailyTarget) {
        int cashForHour;
        int paymentForWorkingHours;
        int paymentForDailyTarget;
        int totalSalary = 0;

        if (employeeType == 0) {
            cashForHour = 50;
            paymentForWorkingHours = cashForHour * workingHours;
            paymentForDailyTarget = dailyTarget * 250;
            totalSalary = paymentForWorkingHours + paymentForDailyTarget;

        } else if (employeeType == 1) {
            cashForHour = 200;
            paymentForWorkingHours = cashForHour * workingHours;
            paymentForDailyTarget = dailyTarget * 250;
            totalSalary = paymentForWorkingHours + paymentForDailyTarget;
        }
        return totalSalary;
    }
}
