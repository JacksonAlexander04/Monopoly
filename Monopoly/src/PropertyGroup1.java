
public class PropertyGroup1 {

	private String groupTitle;
	private String property1Name;
	private String property1Price;
	private String property2Name;
	private String property2Price;
	
	public PropertyGroup1(String t, String p1n, String p1p, String p2n, String p2p) {
		
		groupTitle=t;
		property1Name=p1n;
		property1Price=p1p;
		property2Name=p2n;
		property2Price=p2p;
	}

	public String getGroupTitle() {
		return groupTitle;
	}

	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public String getProperty1Name() {
		return property1Name;
	}

	public void setProperty1Name(String property1Name) {
		this.property1Name = property1Name;
	}

	public String getProperty1Price() {
		return property1Price;
	}

	public void setProperty1Price(String property1Price) {
		this.property1Price = property1Price;
	}

	public String getProperty2Name() {
		return property2Name;
	}

	public void setProperty2Name(String property2Name) {
		this.property2Name = property2Name;
	}

	public String getProperty2Price() {
		return property2Price;
	}

	public void setProperty2Price(String property2Price) {
		this.property2Price = property2Price;
	}
}
