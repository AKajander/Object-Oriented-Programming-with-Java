
public class JuomaAutomaatti {
	private int teet�;
	private int kahvia;
	private int kaakaota;
	
	public JuomaAutomaatti() {
		this.teet� = 50;
		this.kahvia = 50;
		this.kaakaota = 50;
	}
	
	public int getTeet�() {
		return this.teet�;
	}
	
	public void setTeet�(int uusiM��r�Teet�) {
		this.teet� = uusiM��r�Teet�;
	}
	
	public int getKahvia() {
		return this.kahvia;
	}
	
	public void setKahvia(int uusiM��r�Kahvia) {
		this.kahvia = uusiM��r�Kahvia;
	}
	
	public int getKaakaota() {
		return this.kaakaota;
	}
	
	public void setKaakaota(int uusiM��r�Kaakaota) {
		this.kaakaota = uusiM��r�Kaakaota;
	}
	
	public String toString() {
		String tuloste = "Teet� on j�ljell�: " + this.getTeet�() +
				"Kahvia on j�ljell�:" + this.getKahvia() +
				"Kaakaota on j�ljell�: " + this.getKaakaota() + ".";
		return tuloste;
	}
	
	public void valmistaKahvi() {
		System.out.println("Odota hetki, kahvisi valmistuu");
		if (this.kahvia >= 10) {
				this.kahvia -= 10;
			} else {
				System.out.println("Kahvia ei ole en�� j�ljell�! T�yt� s�ili�.");
			}
	}
	
	public void valmistaTee() {
		System.out.println("Odota hetki, teesi valmistuu");
		if (this.teet� >= 10) {
				this.teet� -= 10;
			} else {
				System.out.println("Teet� ei ole en�� j�ljell�! T�yt� s�ili�.");
			}
	}
	
	public void valmistaKaakao() {
		System.out.println("Odota hetki, kaakaosi valmistuu");
		if (this.kaakaota >= 10) {
				this.kaakaota -= 10;
			} else {
				System.out.println("Kaakaota ei ole en�� j�ljell�! T�yt� s�ili�.");
			}
	}
}
