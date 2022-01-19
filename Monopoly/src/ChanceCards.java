
public class ChanceCards extends Game {

	static int randomChance = (int)(Math.random() * 5) + 1;
	
	int location;
	
	public static int CardRunner() {
		
			System.out.println("You have landed on a chance card");
			
			if(randomChance == 1)
				{	
					
					System.out.println("Go To Jail");
					return 10;
					
				}
			
			else if(randomChance == 2)
				{
					System.out.println("Go to Start Space and collect $200");
					return 0; 
					
				}
			
			else if(randomChance == 3)
				{
					System.out.println("Go to Pacific Avenue");
					return 31;
				}
		
			else if(randomChance == 4)
				{
					System.out.println("Go to Electric Company");
					return 12;
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
	
		
	
	}
}
