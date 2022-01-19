import java.util.ArrayList;
import java.util.Scanner;
public class MonopolyRunner
	{
	
	private static ArrayList<Player> playerList = new ArrayList<Player>();
public static int money = 1500;
		public static void main(String[] args)
			{
			Database.generateDatabase();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("What game would you like to play?");
			for (int i = 1; i <= Database.gameDatabase.size(); i++) {
				System.out.println("(" + i + ") " + Database.gameDatabase.get(i-1).getTitle());
			}
			int gameIndex = Integer.parseInt(scanner.next()) - 1;
			scanner.nextLine();
			
			System.out.println("\nWelcome to the game of " + Database.gameDatabase.get(gameIndex).getTitle() + "!");
			System.out.println("How many players?");
			int playerCount = Integer.parseInt(scanner.next());
			scanner.nextLine();
			
			for (int i = 0; i < playerCount; i++) {
			
				System.out.println("\nPlayer " + (i + 1) + ", what piece would you like to play?");
				for (int j = 1; j <= Database.gameDatabase.get(gameIndex).getPieces().getSize(); j++) {
					System.out.println("(" + j + ") " + Database.gameDatabase.get(gameIndex).getPieces().getPiece(j-1));
				}
				
				int pieceIndex = Integer.parseInt(scanner.next());
				scanner.nextLine();
				
				playerList.add(new Player(Database.gameDatabase.get(gameIndex).getPieces().getPiece(pieceIndex-1), 1500, 0));
				Database.gameDatabase.get(gameIndex).getPieces().removePiece(pieceIndex-1);
			}
			
			//if(firstResponse == 1) {
				//Database.generateDatabase();
			//Database.gameDatabase.get(gameIndex);	
				
			//}
			while(true) {
			System.out.println("You have " + money + "$");
			dice.runDice();
			}
			//System.out.println(dice.totalDice);
				
				
				
			}

	}
