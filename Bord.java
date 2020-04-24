package so1_ganzenbord;

public class Bord implements ToString {

	public Bord() {
		System.out.println(toString());
		sysoLine();
	}
	
	private Vak v0;
	private Vak v1;
	private Vak v2;
	private Vak v3;
	private Vak v4;
	private Vak v5;
	private Vak v6;
	private Vak v7;
	private Vak v8;
	private Vak v9;
	private Vak v10;
	private Doel d1;
	
	public void nieuweLocatie(int oldPlace, int worp, Pion pion) {
		int nieuw = oldPlace + worp;
		switch(nieuw) {
		case 1:
			v1.setPion(pion);
			pion.setVakLocatie(v1);
			break;
		case 2:
			v2.setPion(pion);
			pion.setVakLocatie(v2);
			break;
		case 3:
			v3.setPion(pion);
			pion.setVakLocatie(v3);
			break;
		case 4:
			v4.setPion(pion);
			pion.setVakLocatie(v4);
			break;
		case 5:
			v5.setPion(pion);
			pion.setVakLocatie(v5);
			break;
		case 6:
			v6.setPion(pion);
			pion.setVakLocatie(v6);
			break;
		case 7:
			v7.setPion(pion);
			pion.setVakLocatie(v7);
			break;
		case 8:
			v8.setPion(pion);
			pion.setVakLocatie(v8);
			break;
		case 9:
			v9.setPion(pion);
			pion.setVakLocatie(v9);
			break;
		case 10:
			v10.setPion(pion);
			pion.setVakLocatie(v10);
			break;
		default:
			pion.setOpDoelTrue();
			pion.setVakLocatie(d1);
			break;
		}
			
	}
	
	public void sysoLine() {
		System.out.println("----------------------------------------------------");
	}
	
	public String toString() {
		return "Welkom bij Ganzenbord!\nDit is een versimpelde versie van het spel waarbij iedereen maar 1 pion heeft.\n"
				+ "Er zijn bovendien geen obstakels. Zodra jouw pion zijn doel heeft gehaald, wint de speler!";
		
	}
	
	public Vak getV0() {
		return v0;
	}

	public void setV0(Vak v0) {
		this.v0 = v0;
	}

	public Vak getV1() {
		return v1;
	}

	public void setV1(Vak v1) {
		this.v1 = v1;
	}

	public Vak getV2() {
		return v2;
	}

	public void setV2(Vak v2) {
		this.v2 = v2;
	}

	public Vak getV3() {
		return v3;
	}

	public void setV3(Vak v3) {
		this.v3 = v3;
	}

	public Vak getV4() {
		return v4;
	}

	public void setV4(Vak v4) {
		this.v4 = v4;
	}

	public Vak getV5() {
		return v5;
	}

	public void setV5(Vak v5) {
		this.v5 = v5;
	}

	public Vak getV6() {
		return v6;
	}

	public void setV6(Vak v6) {
		this.v6 = v6;
	}

	public Vak getV7() {
		return v7;
	}

	public void setV7(Vak v7) {
		this.v7 = v7;
	}

	public Vak getV8() {
		return v8;
	}

	public void setV8(Vak v8) {
		this.v8 = v8;
	}

	public Vak getV9() {
		return v9;
	}

	public void setV9(Vak v9) {
		this.v9 = v9;
	}

	public Vak getV10() {
		return v10;
	}

	public void setV10(Vak v10) {
		this.v10 = v10;
	}

	public Doel getD1() {
		return d1;
	}

	public void setD1(Doel d1) {
		this.d1 = d1;
	}
	
}
