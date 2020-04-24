package so1_ganzenbord;

public class Pion implements ToString {
	
	public Pion(String kleur, Vak vak) {
		setKleur(kleur);
		setVakLocatie(vak);
	}

	private Vak vakLocatie;
	private Doel doelLocatie;
	private String kleur;
	private boolean isOpDoel = false;
	
	public boolean isOpDoel() {
		return isOpDoel;
	}
	public void setOpDoelTrue() {
		isOpDoel = true;
	}
	public void setKleur(String kleur) {
		switch (kleur) {
		case "Rood":
			this.kleur = kleur;
			break;
		case "Groen":
			this.kleur = kleur;
			break;
		case "Geel":
			this.kleur = kleur;
			break;
		case "Blauw":
			this.kleur = kleur;
			break;
		default:
			System.out.println(kleur + "is niet valide");
			break;
		}
	}
	public Vak getVakLocatie() {
		return vakLocatie;
	}
	public void setVakLocatie(Vak vakLocatie) {
		this.vakLocatie = vakLocatie;
	}
	public Doel getDoelLocatie() {
		return doelLocatie;
	}
	public void setDoelLocatie(Doel doelLocatie) {
		this.doelLocatie = doelLocatie;
	}
	public String getKleur() {
		return kleur;
	}
	
	public String toString() {
		if (isOpDoel) {
			return String.format("%s staat op het einddoel.", getKleur());
		} else {
			return String.format("%s staat op %s en moet nog %s vakken tot zijn doel.", getKleur(), getVakLocatie().getVakNummer(), (11-getVakLocatie().getVakNummer()));
		}
	}
	
	
}
