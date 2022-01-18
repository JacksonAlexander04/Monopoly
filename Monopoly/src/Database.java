import java.util.ArrayList;

public class Database {

	public static ArrayList<Game> gameDatabase = new ArrayList<Game>();
	
	public static void generateDatabase() {
		
		gameDatabase.add(new Game(
				"Monopoly - Original",
				"GO",
				new Properties(
						new PropertyGroup1("Brown","Mediterranean Avenue",60,"Baltic Avenue",60), 
						new PropertyGroup2("Light Blue","Oriental Avenue",100,"Vermont Avenue",100,"Connecticut Avenue",120), 
						new PropertyGroup3("Pink","St. Charles Place",140,"States Avenue",140,"Virginia Avenue",160), 
						new PropertyGroup4("Orange","St.James Place",180,"Tennessee Avenue",180,"New York",220), 
						new PropertyGroup5("Red","Kentucky Avenue",220,"Indiana Avenue",220,"Illinois Avenue",240), 
						new PropertyGroup6("Yellow","Atlantic Avenue",260,"Ventnor Avenue",260,"Marvin Gardens",280), 
						new PropertyGroup7("Green","Pacific Avenue",300,"North Carolina Avenue",300,"Pennsylvania Avenue",320), 
						new PropertyGroup8("Dark Blue","Park Place",350,"Boardwalk",400)),
				new UtilityGroup("Utilities","Electric Company",110,"Water Works", 115),
				new RailroadGroup("Railroads", 200, "God", "Jesus", "Father", "Holy Spirit"),
				new ChanceCards(), // Import Chance cards with a .csv file in the format: cardTitle,cardContent,Action
				new CommunityChestCards(), // Import Community Chest cards with a .csv file in the format: cardTitle,cardContent,Action
				new Pieces("Top hat", "Dog", "Thimble", "Boot", "Wheelbarrow", "Cat", "Iron", "Battleship")
				));

	}

}
