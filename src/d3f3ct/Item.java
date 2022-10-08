package d3f3ct;

public class Item {
	private String efeito1, efeito2, efeito3;
	
	public Item(String efeito1, String efeito2, String efeito3) {
		this.efeito1 = efeito1;
		this.efeito2 = efeito2;
		this.efeito3 = efeito3;
	}
	public Item(String efeito1, String efeito2) {
		this(efeito1, efeito2, "");
	}
	public Item(String efeito1) {
		this(efeito1, "", "");
	}
	
	//Getters
	public String getEfeito1() {
		return efeito1;
	}
	public String getEfeito2() {
		return efeito2;
	}
	public String getEfeito3() {
		return efeito3;
	}
}
