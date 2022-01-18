import java.util.Scanner;
public class MonopolyRunner
	{
public static int money = 1500;
public static int location = 0;
		public static void main(String[] args)
			{
			Database.generateDatabase();
			Scanner scanner = new Scanner(System.in);
			System.out.println("This is the game of Monopoly, what piece would you like to play?");
			System.out.println("(1)" + Database.gameDatabase.get(0).getPieces().getPiece1());
			System.out.println("(2)" + Database.gameDatabase.get(0).getPieces().getPiece2());
			System.out.println("(3)" + Database.gameDatabase.get(0).getPieces().getPiece3());
			System.out.println("(4)" + Database.gameDatabase.get(0).getPieces().getPiece4());
			System.out.println("(5)" + Database.gameDatabase.get(0).getPieces().getPiece5());
			System.out.println("(6)" + Database.gameDatabase.get(0).getPieces().getPiece6());
			System.out.println("(7)" + Database.gameDatabase.get(0).getPieces().getPiece7());
			System.out.println("(8)" + Database.gameDatabase.get(0).getPieces().getPiece8());
			int firstResponse = scanner.nextInt();
			
			if(firstResponse == 1) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece1());	
			}
			if(firstResponse == 2) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece2());	
			}
			if(firstResponse == 3) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece3());	
			}
			if(firstResponse == 4) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece4());	
			}
			if(firstResponse == 5) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece5());	
			}
			if(firstResponse == 6) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece6());	
			}
			if(firstResponse == 7) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece7());	
			}
			if(firstResponse == 8) {
				System.out.println("You are the " + Database.gameDatabase.get(0).getPieces().getPiece8());	
			}
			
			
			System.out.println("You have " + money + "$");
			dice.runDice();
			System.out.println("You roll the dice and you get a roll of " + dice.totalDice );
			location = location  + dice.totalDice;
			
			
			
			//System.out.println(dice.totalDice);
				
				
				
			}

	}
