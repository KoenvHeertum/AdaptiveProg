package so1_ganzenbord;

//import java.util.Random;

public class Dobbelsteen implements ToString{

	private int roll;
	
//	public static void main(String args[]) {
//		Random rdm = new Random();
//		int next = rdm.nextInt(5)+1;	
//	}
	
	public int rollDice() {
		roll = (int)(Math.random()*6+1);
//		System.out.println(roll);
		return roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public String toString() {
		return("Er wordt een dobbelsteen geworpen. Aantal ogen: ") + rollDice();
	}
	
}
