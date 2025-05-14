package Has_a_relationshi_one.to.one;

public class Engine {
	private int cc;
	public int getCC() {
		return cc;
	}
	public void setCC(int cc) {
		this.cc=cc;
	}
	
	Engine(){
		
	}
	
	Engine(int cc){
		setCC(cc);
	}
	
}
