
public class PropertyGroup2 extends Properties {

//	private String groupTitle;
//	private String property1Name;
//	private int property1Price;
//	private String property2Name;
//	private int property2Price;
//	private String property3Name;
//	private int property3Price;
	
	public PropertyGroup2(String t, String p1n, int p1p, int l1, String p2n, int p2p, int l2, String p3n, int p3p, int l3) {
		
		groupTitle=t;
		property1Name=p1n;
		property1Price=p1p;
		location1 = l1;
		property2Name=p2n;
		property2Price=p2p;
		location2 = l2;
		property3Name=p3n;
		property3Price=p3p; 
		location3 = l3;
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

	public int getProperty1Price() {
		return property1Price;
	}

	public void setProperty1Price(int property1Price) {
		this.property1Price = property1Price;
	}

	public String getProperty2Name() {
		return property2Name;
	}

	public void setProperty2Name(String property2Name) {
		this.property2Name = property2Name;
	}

	public int getProperty2Price() {
		return property2Price;
	}

	public void setProperty2Price(int property2Price) {
		this.property2Price = property2Price;
	}

	public String getProperty3Name() {
		return property3Name;
	}

	public void setProperty3Name(String property3Name) {
		this.property3Name = property3Name;
	}

	public int getProperty3Price() {
		return property3Price;
	}

	public void setProperty3Price(int property3Price) {
		this.property3Price = property3Price;
	}
}
