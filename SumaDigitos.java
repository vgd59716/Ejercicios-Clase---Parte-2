import java.util.Scanner;

public class SumaDigitos {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Por favor, introduce un n�mero: ");
	int numero=teclado.nextInt();
	//Voy a ir sumando en un acumulador siempre el �ltimo d�gito
	//cada vez que sume el �ltimo d�gito lo elimino del n�mero
	int acumulador=0;
	while (numero>0) {
		acumulador=acumulador + (numero%10);
		numero=numero/10;
		teclado.close();
	}
	
	System.out.printf("La suma de los d�gitos es: %d", acumulador);
	
	
}
}
