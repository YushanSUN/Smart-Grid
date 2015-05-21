package INF380;

public class Home {
	
	private int p; //production
	private int c; //consommation totale
	private int cc; //consommation critique
	private int co; //consommation optionelle
	private int ap; //appropriation totale
	private int apc; //appropriation critique
	private int apo; //appropriation optionlle
	
	
	private double v;//vatio p/c
	
	private double sati;//satisfaction
	
	public Home(){	
	}
	
	public void setP(int p) {
		this.p=p;
	}
	
	public void setC(int c) {
		this.c=c;
	}
	
	public void setCC(int cc) {
		this.cc=cc;
	}
	
	public void setCO(int co) {
		this.co=co;
	}
	
	public void setAP(int ap) {
		this.ap=ap;
	}
	
	public void setAPC(int apc) {
		this.apc=apc;
	}
	
	public void setAPO(int apo) {
		this.apo=apo;
	}
	
	public void setV() {
		v = p/c;
	} 
	
	public void setSATI() {
		
	}
	
	public double getSati() {
		return sati;
	}
	
	public int getP() {
		return p;
	} 
	
	public int getC() {
		return c;
	} 
	
	public int getCC() {
		return cc;
	} 
	
	public int getCO() {
		return co;
	} 
	
	public double getV() {
		return v;
	} 
	

}
