
public class propertyGroup2 {

	private String groupTitle;
	private String property1Name;
	private String property1Price;
	private String property2Name;
	private String property2Price;
	private String property3Name;
	private String property3Price;
	
	public propertyGroup2(String t, String p1n, String p1p, String p2n, String p2p, String p3n, String p3p) {
		
		t = groupTitle;
		p1n = property1Name;
		p1p = property1Price;
		p2n = property2Name;
		p2p = property2Price;
		p3n = property3Name;
		p3p = property3Price; 
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

	public String getProperty3Name() {
		return property3Name;
	}

	public void setProperty3Name(String property3Name) {
		this.property3Name = property3Name;
	}

	public String getProperty3Price() {
		return property3Price;
	}

	public void setProperty3Price(String property3Price) {
		this.property3Price = property3Price;
	}
}
