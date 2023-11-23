import java.util.Scanner;

public class SumaDigitos {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Por favor, introduce un número: ");
	int numero=teclado.nextInt();
	//Voy a ir sumando en un acumulador siempre el último dígito
	//cada vez que sume el último dígito lo elimino del número
	int acumulador=0;
	while (numero>0) {
		acumulador=acumulador + (numero%10);
		numero=numero/10;
		teclado.close();
	}
	
	System.out.printf("La suma de los dígitos es: %d", acumulador);
	
	
}
}
