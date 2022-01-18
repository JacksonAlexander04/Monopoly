
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
	
	public Game(String t, String gn, Properties prop, UtilityGroup ug, RailroadGroup rg, Pieces piec) {
		
		title = t;
		goName = gn;
		properties = prop;
		utilityGroup = ug;
		railroadGroup = rg;
		//chanceCards = cc;
		//communityChestCards = ccc;
		pieces = piec;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGoName() {
		return goName;
	}

	public void setGoName(String goName) {
		this.goName = goName;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public UtilityGroup getUtilityGroup() {
		return utilityGroup;
	}

	public void setUtilityGroup(UtilityGroup utilityGroup) {
		this.utilityGroup = utilityGroup;
	}

	public RailroadGroup getRailroadGroup() {
		return railroadGroup;
	}

	public void setRailroadGroup(RailroadGroup railroadGroup) {
		this.railroadGroup = railroadGroup;
	}

	public ChanceCards getChanceCards() {
		return chanceCards;
	}

	public void setChanceCards(ChanceCards chanceCards) {
		this.chanceCards = chanceCards;
	}

	public CommunityChestCards getCommunityChestCards() {
		return communityChestCards;
	}

	public void setCommunityChestCards(CommunityChestCards communityChestCards) {
		this.communityChestCards = communityChestCards;
	}

	public Pieces getPieces() {
		return pieces;
	}

	public void setPieces(Pieces pieces) {
		this.pieces = pieces;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

}
