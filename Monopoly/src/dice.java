
public class dice {
	static int totalDice;
	public static void runDice() {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		totalDice = dice1 + dice2;
	
	}
}
