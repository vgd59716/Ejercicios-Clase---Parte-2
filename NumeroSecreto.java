import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
public static void main(String[] args) {
	Scanner sc;
	int numintentos = 5;
	Random numSecreto;
	numSecreto = new Random();
	sc = new Scanner(System.in);
	int numOculto = 1+numSecreto.nextInt(9);

	while (numintentos>0) 
	{
	System.out.println("Por favor, introduce un n�mero del 1 al 10");
	int numero = sc.nextInt();
	if (numero==numOculto)
	{
		System.out.printf ("Felicidades, has acertado el n�mero %d", numOculto);
		break;
	}
	else numintentos--;
	}
	if (numintentos==0) {System.out.printf ("No has acertado el n�mero %d", numOculto);}
	sc.close();
}
}

