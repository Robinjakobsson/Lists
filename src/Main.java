import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>scoresList = new ArrayList<>();
        System.out.println("Welcome to the Competition");

        while (isRunning) {

        System.out.println("1. Add score");
        System.out.println("2. Show all scores");
        System.out.println("3. Show highest score");
        System.out.println("4. show average score");
        System.out.println("5. Clear scorelist.");
        System.out.println("6. Exit program");
        int input = scanner.nextInt();

        if (input < 1 || input > 6) {
            System.out.println("Not valid choice.. try again.");

        }else {
            switch (input){
                case 1:
                    System.out.println("Insert score");
                    int score = scanner.nextInt();
                    scoresList.add(score);
                    System.out.println("Score added!");
                    break;

                case 2:
                    System.out.println("The scores are" + scoresList);
                    break;

                case 3:
                    if (scoresList.isEmpty()){
                        System.out.println("Could not fetch any scores.");
                    }else {
                        int highestScore = Integer.MIN_VALUE;
                        for (int currentScore : scoresList) {
                            if (currentScore > highestScore) {
                                highestScore = currentScore;

                            }
                        }

                        System.out.println("highestScore is:  " + highestScore);

                        break;
                    }

                case 4:
                    int sum = 0;
                    for (int currentscore : scoresList){
                        sum += currentscore;
                    }
                    int averageScore = sum / scoresList.size();
                    System.out.println("The average score is: " + averageScore);
                    break;

                case 5:
                    scoresList.clear();
                    break;

                case 6:
                    isRunning = false;
                    break;
            }
        }


        }



    }

}