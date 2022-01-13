
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
	
	public String getGoTitle() {
		return goTitle;
	}

	public void setGoTitle(String goTitle) {
		this.goTitle = goTitle;
	}

	public String getIncomeTaxTitle() {
		return incomeTaxTitle;
	}

	public void setIncomeTaxTitle(String incomeTaxTitle) {
		this.incomeTaxTitle = incomeTaxTitle;
	}

	public String getJailTitle() {
		return jailTitle;
	}

	public void setJailTitle(String jailTitle) {
		this.jailTitle = jailTitle;
	}

	public String getFreeParkingTitle() {
		return freeParkingTitle;
	}

	public void setFreeParkingTitle(String freeParkingTitle) {
		this.freeParkingTitle = freeParkingTitle;
	}

	public String getGoToJailTitle() {
		return goToJailTitle;
	}

	public void setGoToJailTitle(String goToJailTitle) {
		this.goToJailTitle = goToJailTitle;
	}

	public String getLuxuryTaxTitle() {
		return luxuryTaxTitle;
	}

	public void setLuxuryTaxTitle(String luxuryTaxTitle) {
		this.luxuryTaxTitle = luxuryTaxTitle;
	}

	public int getGoPrice() {
		return goPrice;
	}

	public void setGoPrice(int goPrice) {
		this.goPrice = goPrice;
	}

	public int getIncomeTaxPrice() {
		return incomeTaxPrice;
	}

	public void setIncomeTaxPrice(int incomeTaxPrice) {
		this.incomeTaxPrice = incomeTaxPrice;
	}

	public int getJailPrice() {
		return jailPrice;
	}

	public void setJailPrice(int jailPrice) {
		this.jailPrice = jailPrice;
	}

	public int getFreeParkingPrice() {
		return freeParkingPrice;
	}

	public void setFreeParkingPrice(int freeParkingPrice) {
		this.freeParkingPrice = freeParkingPrice;
	}

	public int getGoToJailPrice() {
		return goToJailPrice;
	}

	public void setGoToJailPrice(int goToJailPrice) {
		this.goToJailPrice = goToJailPrice;
	}

	public int getLuxuryTaxPrice() {
		return luxuryTaxPrice;
	}

	public void setLuxuryTaxPrice(int luxuryTaxPrice) {
		this.luxuryTaxPrice = luxuryTaxPrice;
	}

	public int getGOLocation() {
		return 0;
	}
	
	public int getIncomeTaxLocation() {
		return 4;
	}
	
	public int getJailLocation() {
		return 10;
	}
	
	public int getFreeParkingLocation() {
		return 20;
	}
	
	public int getGoToJailLocation() {
		return 30;
	}
	
	public int getLuxuryTaxLocation() {
		return 38;
	}
	
}
