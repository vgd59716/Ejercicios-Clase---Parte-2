import java.util.Random;
public class NumeroRandom {
public static void main(String[] args) {
	Random rd;
	rd = new Random();
	int numRandom;
	numRandom =5 + rd.nextInt(10);//Entre 5 y 15
	System.out.println(numRandom);
	
}
}
