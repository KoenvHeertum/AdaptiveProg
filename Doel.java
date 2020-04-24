package so1_ganzenbord;

import java.util.ArrayList;

public class Doel extends Vak implements ToString {

	public Doel(int vakNummer) {
		super(vakNummer);
	}
	
	private ArrayList<Pion> pions = new ArrayList();
	private int vakNummer;
	
	public int getVakNummer() {
		return vakNummer;
	}
	public void setVakNummer(int vakNummer) {
		this.vakNummer = vakNummer;
	}
	public String getPion() {
		String s = "";
		for (Pion item: pions) {
			s += item.getKleur() + ", " + s;
		}
		return s;
	}
	public void addPions(Pion pion) {
		pions.add(pion);
	}
	
	public String toString() {
		return String.format("Op de finishlijn staat het volgende: %s", getVakNummer(), getPion());
	}

}
