import java.util.Scanner;

public class appointmentTimeTaxIncomeTask7 {
    public static void main(String[] args) {
        int dayNumber;
        int earliestHour;
        int latestHour;
        boolean loopsTerm;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter the day number you interested in arriving (for sunday enter 1 etc): ");
        dayNumber = number.nextInt();
        loopsTerm = false;
        while (loopsTerm == false) {
            if (dayNumber > 7 || dayNumber < 1) {
                System.out.println("You have chose invalid day.");
                loopsTerm = false;
                break;
            }

            if (dayNumber == 6 || dayNumber == 7) {
                System.out.println("Our offices are closed on weekends");
                loopsTerm = false;
                break;
            }

            if (dayNumber < 6 || dayNumber > 1) {
                loopsTerm = true;
            }
        }

        while (loopsTerm == true) {
            System.out.println("Enter the earliest hour you can arrive: ");
            earliestHour = number.nextInt();

            if (earliestHour > 23 || earliestHour < 0) {
                System.out.println("You have chose invalid hour.");
                loopsTerm = false;
                break;
            } else {
                loopsTerm = true;
            }

            System.out.println("Enter the latest hour you can arrive: ");
            latestHour = number.nextInt();

            if (latestHour > 23 || latestHour < 0) {
                System.out.println("You have chose invalid hour.");
                loopsTerm = false;
                break;
            }

            if (earliestHour > latestHour) {
                System.out.println("You have been enter bigger earliest hour than latest hour, please enter valid hours range");
                loopsTerm = false;
                break;
            } else
                appointmentSchedule(dayNumber, earliestHour, latestHour);
            break;
        }
    }


    public static void appointmentSchedule(int dayNumber, int earliestHour, int latestHour) {

        if (dayNumber == 1) {
            if (earliestHour >= 9 && earliestHour <= 16) {
                System.out.println("An appointment was scheduled to Sunday at: " + earliestHour);
            } else if (latestHour >= 9 && latestHour <= 16) {
                System.out.println("An appointment was scheduled to Sunday at: " + latestHour);
            } else {
                System.out.println("Our offices are closed on these hours. " +
                        "Sunday opening hours: 09:00 - 17:00");
            }

        } else if (dayNumber == 2) {
            if (earliestHour >= 9 && earliestHour <= 16) {
                System.out.println("An appointment was scheduled to Monday at: " + earliestHour);
            } else if (latestHour >= 9 && latestHour <= 16) {
                System.out.println("An appointment was scheduled to Monday at: " + latestHour);
            } else {
                System.out.println("Our offices are closed on these hours. " +
                        "Monday opening hours: 09:00 - 17:00");
            }

        } else if (dayNumber == 3) {
            if (earliestHour >= 8 && earliestHour <= 11) {
                System.out.println("An appointment was scheduled to Tuesday at: " + earliestHour);
            } else if (latestHour >= 8 && latestHour <= 11) {
                System.out.println("An appointment was scheduled to Tuesday at: " + latestHour);
            } else {
                System.out.println("Our offices are closed on these hours. " +
                        "Tuesday opening hours: 08:00 - 12:00");
            }
        } else if (dayNumber == 4) {
            if (earliestHour >= 9 && earliestHour <= 16) {
                System.out.println("An appointment was scheduled to Wednesday at: " + earliestHour);
            } else if (latestHour >= 9 && latestHour <= 16) {
                System.out.println("An appointment was scheduled to Wednesday at: " + latestHour);
            } else {
                System.out.println("Our offices are closed on these hours. " +
                        "Wednesday opening hours: 09:00 - 17:00");
            }
        } else if (dayNumber == 5) {
            if (earliestHour >= 9 && earliestHour <= 16) {
                System.out.println("An appointment was scheduled to Thursday at: " + earliestHour);
            } else if (latestHour >= 9 && latestHour <= 16) {
                System.out.println("An appointment was scheduled to Thursday at: " + latestHour);
            } else {
                System.out.println("Our offices are closed on these hours. " +
                        "Thursday opening hours: 09:00 - 17:00");
            }
        }
    }
}
