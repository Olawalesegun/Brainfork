package Encapsulation;
import java.util.Scanner;

public class Launcher {
	private int guessedNum;
	private int player1_guessedNum;
	private int player2_guessedNum;
	private int player3_guessedNum;
	
	public void setguessedNum(int guessedNum) {
		this.guessedNum = guessedNum;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Guesser guesser = new Guesser();
		System.out.println(" Hello, you're welcome."
				+ "Start the Challenge, by Guessing a number");
		
		int guessedNum = scan.nextInt();
		guesser.setGuessedNumber(guessedNum);
		
				
		
	}

}
