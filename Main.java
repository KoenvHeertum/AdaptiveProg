package so1_ganzenbord;

public class Main {

	public static void main(String[] args) {
//		Initializing
		Bord bord = new Bord();
		Dobbelsteen db1 = new Dobbelsteen();
		Vak v0 = new Vak(0);
		Vak v1 = new Vak(1);
		Vak v2 = new Vak(2);
		Vak v3 = new Vak(3);
		Vak v4 = new Vak(4);
		Vak v5 = new Vak(5);
		Vak v6 = new Vak(6);
		Vak v7 = new Vak(7);
		Vak v8 = new Vak(8);
		Vak v9 = new Vak(9);
		Vak v10 = new Vak(10);
		Doel d1 = new Doel(11);
		Pion p1 = new Pion("Rood", v0);
		Pion p2 = new Pion("Groen", v0);
		Pion p3 = new Pion("Geel", v0);
		Pion p4 = new Pion("Blauw", v0);
		bord.setV0(v0);
		bord.setV1(v1);
		bord.setV2(v2);
		bord.setV3(v3);
		bord.setV4(v4);
		bord.setV5(v5);
		bord.setV6(v6);
		bord.setV7(v7);
		bord.setV8(v8);
		bord.setV9(v9);
		bord.setV10(v10);
		bord.setD1(d1);
		v0.setPion(p1);
		v0.setPion(p2);
		v0.setPion(p3);
		v0.setPion(p4);
		p1.setDoelLocatie(d1);
		p2.setDoelLocatie(d1);
		p3.setDoelLocatie(d1);
		p4.setDoelLocatie(d1);
		
//		Spel spelen
		int i = 1;
		while(p1.isOpDoel() == false && p2.isOpDoel() == false && p3.isOpDoel() == false && p4.isOpDoel() == false) {
			System.out.println("Ronde " + i);
			System.out.println(p1.toString());
			System.out.println(db1.toString());
			bord.nieuweLocatie(p1.getVakLocatie().getVakNummer(), db1.getRoll(), p1);
			System.out.println(p1.toString());
			bord.sysoLine();
			System.out.println(p2.toString());
			System.out.println(db1.toString());
			bord.nieuweLocatie(p2.getVakLocatie().getVakNummer(), db1.getRoll(), p2);
			System.out.println(p2.toString());
			bord.sysoLine();
			System.out.println(p3.toString());
			System.out.println(db1.toString());
			bord.nieuweLocatie(p3.getVakLocatie().getVakNummer(), db1.getRoll(), p3);
			System.out.println(p3.toString());
			bord.sysoLine();
			System.out.println(p4.toString());
			System.out.println(db1.toString());
			bord.nieuweLocatie(p4.getVakLocatie().getVakNummer(), db1.getRoll(), p4);
			System.out.println(p4.toString());
			bord.sysoLine();
			i++;
		}
		System.out.println(v0.toString());
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		System.out.println(v5.toString());
		System.out.println(v6.toString());
		System.out.println(v7.toString());
		System.out.println(v8.toString());
		System.out.println(v9.toString());
		System.out.println(v10.toString());
		System.out.println(d1.toString());
		
		
	}

}
