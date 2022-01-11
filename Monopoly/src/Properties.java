
public class Properties extends Game {


	private PropertyGroup1 propertyGroup1;
	private PropertyGroup2 propertyGroup2;
	private PropertyGroup3 propertyGroup3;
	private PropertyGroup4 propertyGroup4;
	private PropertyGroup5 propertyGroup5;
	private PropertyGroup6 propertyGroup6;
	private PropertyGroup7 propertyGroup7;
	private PropertyGroup8 propertyGroup8;
	
	protected String groupTitle;
	protected String property1Name;
	protected int property1Price;
	protected String property2Name;
	protected int property2Price;
	protected String property3Name;
	protected int property3Price;
	
	
	public Properties() {
		
	}
	
	public Properties(PropertyGroup1 g1, PropertyGroup2 g2, PropertyGroup3 g3, PropertyGroup4 g4, PropertyGroup5 g5, 
			PropertyGroup6 g6, PropertyGroup7 g7, PropertyGroup8 g8) {
		
		propertyGroup1 = g1;
		propertyGroup2 = g2;
		propertyGroup3 = g3;
		propertyGroup4 = g4;
		propertyGroup5 = g5;
		propertyGroup6 = g6;
		propertyGroup7 = g7;
		propertyGroup8 = g8;
		
	}
}
