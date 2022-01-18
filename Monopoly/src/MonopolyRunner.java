import java.util.Scanner;
public class MonopolyRunner
	{
public static int money = 1500;
		public static void main(String[] args)
			{
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("This is the game of Monopoly, what piece would you like to play?");
			System.out.println("(1) Top Hat");
			System.out.println("(2) Dog");
			System.out.println("(3) Thimble");
			System.out.println("(4) Boot");
			System.out.println("(5) Wheelbarrow");
			System.out.println("(6) Cat");
			System.out.println("(7) Iron");
			System.out.println("(8) Battleship");
			int firstResponse = scanner.nextInt();
			
			//if(firstResponse == 1) {
				//Database.generateDatabase();
			//Database.gameDatabase.get(0);	
				
			//}
			while(true) {
			System.out.println("You have " + money + "$");
			dice.runDice();
			}
			//System.out.println(dice.totalDice);
				
				
				
			}

	}
