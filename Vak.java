package so1_ganzenbord;

import java.util.ArrayList;

public class Vak implements ToString{
	
	public Vak(int vakNummer) {
		setVakNummer(vakNummer);
	}
	
	private int vakNummer;
//	private Pion pion;
	private ArrayList<Pion> pions = new ArrayList();

	public int getVakNummer() {
		return vakNummer;
	}

	public void setVakNummer(int vakNummer) {
		this.vakNummer = vakNummer;
	}
	
	public String getPion() {
		String s = "";
		if(pions.size() == 2) {
//			for (Pion item: pions) {
//				s += item.getKleur() + ", " + s;
//			}	
			s = pions.get(0).getKleur() + ", " + pions.get(1).getKleur();
		} else if (pions.size() == 1) {
			s = pions.get(0).getKleur();
		} else {
			return s;
		}
		return s;
	}
	
	public void setPion(Pion pion) {
		pions.add(pion);
	}
	
	public String toString() {
		return String.format("Op vak %s staat het volgende: %s", getVakNummer(), getPion());
	}

}
