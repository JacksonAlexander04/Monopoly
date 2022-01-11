
public class Game {
	
	private String title;
	private String goName;
	private Properties properties;
	private UtilityGroup utilityGroup;
	private RailroadGroup railroadGroup;
	private ChanceCards chanceCards;
	private CommunityChestCards communityChestCards;
	private Pieces pieces;
	
	protected int location;
	
	public Game() {
		// Implemented to allow implementation of utilities, railroads, and properties
	}
	
	public Game(String t, String gn, Properties prop, UtilityGroup ug, RailroadGroup rg, ChanceCards cc, CommunityChestCards ccc, Pieces piec) {
		
		title = t;
		goName = gn;
		properties = prop;
		utilityGroup = ug;
		railroadGroup = rg;
		chanceCards = cc;
		communityChestCards = ccc;
		pieces = piec;
	}

}
