import java.util.Scanner;

public class guessLotteryNumberGameTask10 {
    public static void main(String[] args){
        int lotteryChosenNumber;

        lotteryChosenNumber = randomNumberLottery();
        numberGuessChecker(lotteryChosenNumber);
    }

    public static int randomNumberLottery(){
        int randomNumber;

        randomNumber = ((int) (Math.random() * (1000))+1);
        return randomNumber;
    }

    public static void numberGuessChecker(int lotteryScore){
        int guessPlayer1;
        int guessPlayer2;
        int roundNumber = 0;

        Scanner number = new Scanner(System.in);

        do {
            System.out.println("player 1, enter guess number: ");
            guessPlayer1 = number.nextInt();
            roundNumber = roundNumber +1;

            if (guessPlayer1 == lotteryScore){
                guessPlayer2 = -1000;
                break;


            }
            else if (guessPlayer1 > lotteryScore){
                System.out.println("Last guess is bigger than the secret chosen number");
            }
            else if (guessPlayer1 < lotteryScore){
                System.out.println("Last guess is smaller than the secret chosen number");
            }

            System.out.println("player 2, enter guess number: ");
            guessPlayer2 = number.nextInt();

            if (guessPlayer2 == lotteryScore){
                break;

            }
            else if (guessPlayer2 > lotteryScore){
                System.out.println("Last guess is bigger than the secret chosen number");
            }
            else if (guessPlayer2 < lotteryScore){
                System.out.println("Last guess is smaller than the secret chosen number");
            }

        }while (lotteryScore != guessPlayer1 && lotteryScore != guessPlayer2);


        if (lotteryScore == guessPlayer1){
            System.out.println("Player 1 won after " + roundNumber +" rounds");
        }
        else  if (lotteryScore == guessPlayer2){
            System.out.println("Player 2 won after " + roundNumber +" rounds");
        }
    }
}
