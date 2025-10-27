import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    private static final int MIN_NUMBER=1;
    private static final int MAX_NUMBER=100;
    private static final int MAX_ATTEMPTS=7;
    private static final int POINTS_PER_ROUND=100;
    
    private Scanner sc;
    private Random random;
    private int totalScore;
    private int roundsPlayed;
    
    public NumberGuessingGame() {
        this.sc=new Scanner(System.in);
        this.random=new Random();
        this.totalScore=0;
        this.roundsPlayed=0;
    }
    
    public static void main(String[] args) {
        NumberGuessingGame game=new NumberGuessingGame();
        game.startGame();
    }
    
    public void startGame() {
        System.out.println(" Welcome to the NUMBER GUESSING GAME! ");
        System.out.println("=========================================");
        System.out.println("I'm thinking of a number between "+MIN_NUMBER+" and "+MAX_NUMBER);
        System.out.println("You have " +MAX_ATTEMPTS+ " attempts to guess it!");
        System.out.println("Good luck! \n");
        
        boolean playAgain=true;
        
        while(playAgain) {
            playRound();
            roundsPlayed++;
            System.out.println("\n Current Statistics:");
            System.out.println("Rounds Played: "+roundsPlayed);
            System.out.println("Total Score: "+totalScore);
            System.out.println("Average Score: "+(roundsPlayed > 0 ? totalScore / roundsPlayed : 0));
            
            System.out.print("\nWould you like to play another round? (yes/no): ");
            String response=sc.nextLine().toLowerCase().trim();
            playAgain=response.equals("yes")||response.equals("y");
            
            if(playAgain) {
                System.out.println("\n" + "=".repeat(50));
                System.out.println(" NEW ROUND STARTING! ");
                System.out.println("I'm thinking of a new number between "+MIN_NUMBER+ " and "+MAX_NUMBER);
                System.out.println("You have " +MAX_ATTEMPTS+ " attempts to guess it!\n");
            }
        }
        
        displayFinalResults();
        sc.close();
    }
    private void playRound() {
        int targetNumber=generateRandomNumber();
        int attempts=0;
        boolean guessed=false;
        
        System.out.println("🎲 Round "+(roundsPlayed+1)+"-Let's begin!");
        
        while(attempts < MAX_ATTEMPTS && !guessed) {
            attempts++;
            int remainingAttempts=MAX_ATTEMPTS-attempts;
            
            System.out.print("Attempt "+attempts+"/"+MAX_ATTEMPTS+
                           " - Enter your guess (" +MIN_NUMBER+ "-" +MAX_NUMBER + "): ");
            
            try {
                int userGuess=Integer.parseInt(sc.nextLine().trim());
                
                if(userGuess < MIN_NUMBER || userGuess > MAX_NUMBER) {
                    System.out.println(" Please enter a number between " +MIN_NUMBER+ " and " +MAX_NUMBER);
                    attempts--;
                }
                
                if(userGuess == targetNumber) {
                    guessed=true;
                    int roundScore=calculateScore(attempts);
                    totalScore+=roundScore;
                    
                    System.out.println(" Congratulations! You guessed it right!");
                    System.out.println(" The number was: "+targetNumber);
                    System.out.println(" You used " +attempts+ " attempt(s)");
                    System.out.println(" Round Score: " +roundScore+ " points");
                    
                } else if (userGuess < targetNumber) {
                    System.out.println(" Too low! The number is higher than "+userGuess);
                    if(remainingAttempts > 0) {
                        System.out.println(" You have " +remainingAttempts+ " attempt(s) remaining");
                    }
                } else {
                    System.out.println(" Too high! The number is lower than " +userGuess);
                    if(remainingAttempts > 0) {
                        System.out.println(" You have " +remainingAttempts+ " attempt(s) remaining");
                    }
                }
                
            } catch(NumberFormatException e) {
                System.out.println(" Invalid input! Please enter a valid number.");
                attempts--; 
            }
            
            System.out.println(); 
        }
        
        if(!guessed) {
            System.out.println(" Game Over! You've used all " + MAX_ATTEMPTS + " attempts.");
            System.out.println(" The correct number was: "+targetNumber);
            System.out.println(" Round Score: 0 points");
        }
    }
    private int generateRandomNumber() {
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
    
    private int calculateScore(int attempts) {
        if (attempts <= 0) 
        return 0;
        int baseScore=POINTS_PER_ROUND;
        int penalty=(attempts - 1)*10;
        int score=Math.max(0,baseScore - penalty);
        
        return score;
    }
    private void displayFinalResults() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(" FINAL RESULTS ");
        System.out.println("=".repeat(50));
        System.out.println("Total Rounds Played: "+roundsPlayed);
        System.out.println("Total Score: "+totalScore);
        
        if(roundsPlayed > 0) {
            System.out.println("Average Score per Round: "+(totalScore/roundsPlayed));
            int averageScore=totalScore/roundsPlayed;
            String rating;
            if (averageScore >= 80) {
                rating=" EXCELLENT! ";
            } else if(averageScore >= 60) {
                rating=" GREAT! ";
            } else if(averageScore >= 40) {
                rating=" GOOD! ";
            } else if(averageScore >= 20) {
                rating=" OKAY! ";
            } else {
                rating=" KEEP PRACTICING! ";
            }
            
            System.out.println("Performance Rating: "+rating);
        }
        
        System.out.println("\nThank you for playing the Number Guessing Game! ");
        System.out.println("Come back soon for more fun! ");
    }
}
