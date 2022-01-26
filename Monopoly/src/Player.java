import java.util.ArrayList;

public class Player {

	
	public String name;
	public static int money;
	public static int location;
	public static ArrayList <String[]> inventory = new ArrayList <String[]> ();
	
	public Player (String n, int m, int l, ArrayList <String[]> i) {
		
		name = n;
		money = m;
		location = l;
		inventory = i;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;

	}
	
	public void addProperty(String[] s)
	{
		inventory.add(s);
	}
	public void printInventory() {
		for(int i = 0; i < inventory.size(); i++) {
		System.out.println(inventory.get(i)[0]);
		}
	}
	public void reverseMovement(int il) {
		MonopolyRunner.gameIndex-= il;
		if(MonopolyRunner.gameIndex<0) {
			MonopolyRunner.gameIndex+=40;
		}
		
	}
	
}
