import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Logic {
	
	static boolean gameBeingPlayed = true;
	Scanner scanner = new Scanner(System.in);
	static String [] guesses = FileHandle.Words50.toArray(new String[FileHandle.Words50.size()]);
	private static Random random;
	static char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
	static int numOfGuesses = randomWordToGuess.length;
	

	
	public static void main(String[] args){
		while(gameBeingPlayed){
			char[] playerGuess = new char[numOfGuesses];
			
			for(int i = 0; i < playerGuess.length; i++){
				playerGuess[i]  = '_';
			} //end of forloop
			
			boolean isWordGuessed = false;
			int attempts = 0;
			while(!isWordGuessed && attempts != numOfGuesses){
				System.out.println("Current guesses: ");
				System.out.println(playerGuess);
				System.out.println("You have " + (numOfGuesses - attempts) + " tries left");
			} // end of (nested) while
			
			
		} // end of gameBeingPlayed 
	
		
	
	}




		
		
		
}
		 
		 
