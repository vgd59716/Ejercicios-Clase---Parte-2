import java.util.Scanner;

public class CalculadoraEuros {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor, introduce la cantidad en pesetas: ");
	final double FACTOR_CONV=166.386;
	int pesetas=sc.nextInt();
	if (pesetas<0) System.out.println("La cantidad introducida no es correcta, tiene que ser mayor que cero");
	else System.out.printf("La cantidad en euros es: %.2f", (pesetas/FACTOR_CONV));
	sc.close();
}
}
