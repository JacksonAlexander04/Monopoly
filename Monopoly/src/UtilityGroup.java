
public class UtilityGroup extends Game {

	private String utilityGroupTitle;
	private String utility1Name;
	private int utility1Price;
	private String utility2Name;
	private int utility2Price;
	
	public UtilityGroup(String t, String p1n, int p1p, String p2n, int p2p) {
		
		utilityGroupTitle=t;
		utility1Name=p1n;
		utility1Price=p1p;
		utility2Name=p2n;
		utility2Price=p2p;
	}

	public String getGroupTitle() {
		return utilityGroupTitle;
	}

	public void setGroupTitle(String groupTitle) {
		this.utilityGroupTitle = groupTitle;
	}

	public String getProperty1Name() {
		return utility1Name;
	}

	public void setProperty1Name(String property1Name) {
		this.utility1Name = property1Name;
	}

	public int getProperty1Price() {
		return utility1Price;
	}

	public void setProperty1Price(int property1Price) {
		this.utility1Price = property1Price;
	}

	public String getProperty2Name() {
		return utility2Name;
	}

	public void setProperty2Name(String property2Name) {
		this.utility2Name = property2Name;
	}

	public int getProperty2Price() {
		return utility2Price;
	}

	public void setProperty2Price(int property2Price) {
		this.utility2Price = property2Price;
	}
}
