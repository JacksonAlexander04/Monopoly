
public class CommunityChestCards extends Game {
	
	int location;
	
	
	public static int CommunityChestCards() {
		
		System.out.println("You pick the top chance card");
		int randomChance = (int)(Math.random() * 5) + 1;
		
		if(randomChance == 1)
			{	
				
				System.out.println("Go To Jail");
				return 30;
				
			}
		
		else if(randomChance == 2)
			{
				System.out.println("Go to Start Space and collect $200");
				return 0; 
				
			}
		
		else if(randomChance == 3)
			{
				System.out.println("You lose $100");
				Player.money = Player.money - 100;
				return Player.location;
			}
		
	
		else if(randomChance == 4)
			{
				System.out.println("You find $100");
				Player.money = Player.money + 100;
				return Player.location;
			}
		
		
		else if(randomChance == 5)
			{
				System.out.println("Go to Income Tax");
				return 4;
				
			}
		
		else 
			{
				System.out.println("error");
			}
		
		return 0;
	}
	}

