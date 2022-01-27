
public class dice {
	private static int totalDice;
	public static int dice1;
	public static int dice2;
	public static int runDice() {
		dice1 = (int)(Math.random() * 6) + 1;
		dice2 = (int)(Math.random() * 6) + 1;
		totalDice = dice1 + dice2;
	
		return totalDice;
	}
}
