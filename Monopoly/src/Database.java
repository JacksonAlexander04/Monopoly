import java.util.ArrayList;

public class Database {

	public static ArrayList<Game> gameDatabase = new ArrayList<Game>();
	
	public static void generateDatabase() {
		
		gameDatabase.add(new Game(
				"Original Monopoly",
				"GO",
				new Properties(
						new PropertyGroup1("Brown","Mediterranean Avenue",60,1,"Baltic Avenue",60,3), 
						new PropertyGroup2("Light Blue","Oriental Avenue",100,6,"Vermont Avenue",100,8,"Connecticut Avenue",120,9), 
						new PropertyGroup3("Pink","St. Charles Place",140,11,"States Avenue",140,13,"Virginia Avenue",160,14), 
						new PropertyGroup4("Orange","St.James Place",180,16,"Tennessee Avenue",180,18,"New York",220,19), 
						new PropertyGroup5("Red","Kentucky Avenue",220,21,"Indiana Avenue",220,23,"Illinois Avenue",240,24), 
						new PropertyGroup6("Yellow","Atlantic Avenue",260,26,"Ventnor Avenue",260,27,"Marvin Gardens",280,29), 
						new PropertyGroup7("Green","Pacific Avenue",300,31,"North Carolina Avenue",300,32,"Pennsylvania Avenue",320,34), 
						new PropertyGroup8("Dark Blue","Park Place",350,37,"Boardwalk",400,39)),
<<<<<<< HEAD
				new UtilityGroup("Utilities","Electric Company",110,"Water Works", 115),
				new RailroadGroup("Railroads", 200, "God", "Jesus", "Father", "Holy Spirit"),
=======
				new UtilityGroup("Utilities","Electric Company",110,12,"Water Works", 115,28),
				new RailroadGroup("Railroads", 200, "Reading Railroad", 5, "Pennsylvania Railroad", 15, "B. & O. Railroad", 25, "Short Line", 35),
				new SpecialSpaces("Go", 200, "Income Tax", 200, "Jail", 50, "Free Parking", 0, "Go To Jail", 0, "Luxury Tax", 100),
>>>>>>> upstream/master
				//new ChanceCards(), // Import Chance cards with a .csv file in the format: cardTitle,cardContent,Action
				//new CommunityChestCards(), // Import Community Chest cards with a .csv file in the format: cardTitle,cardContent,Action
				new Pieces("Top hat", "Dog", "Thimble", "Boot", "Wheelbarrow", "Cat", "Iron", "Battleship")
				));

	}

}
