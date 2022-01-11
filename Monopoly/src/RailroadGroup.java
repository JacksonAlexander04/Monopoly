
public class RailroadGroup extends Game {

	private String railroadGroupTitle;
	private int railroadPrices;
	private String railroad1Name;
	private String railroad2Name;
	private String railroad3Name;
	private String railroad4Name;
	
	public RailroadGroup(String t, int price, String r1n, String r2n, String r3n, String r4n) {
		
		railroadGroupTitle=t;
		railroadPrices = price;
		railroad1Name = r1n;
		railroad2Name = r2n;
		railroad3Name = r3n;
		railroad4Name = r4n;
		
	}

	public String getRailroadGroupTitle() {
		return railroadGroupTitle;
	}

	public void setRailroadGroupTitle(String railroadGroupTitle) {
		this.railroadGroupTitle = railroadGroupTitle;
	}

	public int getRailroadPrices() {
		return railroadPrices;
	}

	public void setRailroadPrices(int railroadPrices) {
		this.railroadPrices = railroadPrices;
	}

	public String getRailroad1Name() {
		return railroad1Name;
	}

	public void setRailroad1Name(String railroad1Name) {
		this.railroad1Name = railroad1Name;
	}

	public String getRailroad2Name() {
		return railroad2Name;
	}

	public void setRailroad2Name(String railroad2Name) {
		this.railroad2Name = railroad2Name;
	}

	public String getRailroad3Name() {
		return railroad3Name;
	}

	public void setRailroad3Name(String railroad3Name) {
		this.railroad3Name = railroad3Name;
	}

	public String getRailroad4Name() {
		return railroad4Name;
	}

	public void setRailroad4Name(String railroad4Name) {
		this.railroad4Name = railroad4Name;
	}
}
