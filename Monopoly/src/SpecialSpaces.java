
public class SpecialSpaces extends Game{

	private String goTitle;
	private String incomeTaxTitle;
	private String jailTitle;
	private String freeParkingTitle;
	private String goToJailTitle;
	private String luxuryTaxTitle;
	
	private int goPrice;
	private int incomeTaxPrice;
	private int jailPrice;
	private int freeParkingPrice;
	private int goToJailPrice;
	private int luxuryTaxPrice;
	
	
	public SpecialSpaces(String gt, int gp, String itt, int itp, String jt, int jp, String pt, int pp, String tjt, int tjp, String ltt, int ltp) {
		
		goTitle = gt;
		goPrice = gp;
//		location = 0;
		incomeTaxTitle = itt;
		incomeTaxPrice = itp;
//		location = 4;
		jailTitle = jt;
		jailPrice = jp;
//		location = 10;
		freeParkingTitle = pt;
		freeParkingPrice = pp;
//		location = 20;
		goToJailTitle = tjt;
		goToJailPrice = tjp;
//		location = 30;
		luxuryTaxTitle = ltt;
		luxuryTaxPrice = ltp;
//		location = 38;
	}
	
}
