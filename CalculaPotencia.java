import java.util.Scanner;
public class CalculaPotencia {
	
public static void main(String[] args) {
	
int base,exponente,exponentepositivo;
double potencia=0;

Scanner teclado;
teclado = new Scanner(System.in);
//Leo la base y el exponente desde teclado

System.out.println("Introduce la base: ");
base = teclado.nextInt();
System.out.println("Introduce el exponente: ");
exponente = teclado.nextInt();
/*La potencia de un número es ese número las veces 
 que indique el exponente
 */
if (exponente==0)
	
{potencia=1;
}
else if (exponente>0) 
	{	potencia = 1;
	for (int i=1;i<=exponente;i++)
		{potencia=potencia*base;}
	}
	else if (exponente<0){	
		potencia = 1;
		exponentepositivo=(0-exponente);
		for (int i=1;i<=exponentepositivo;i++)
		{potencia=potencia*base;}
		potencia=1/potencia;
	}

System.out.printf("%d elevado a %d es igual a %.3f", base, exponente,potencia);	
teclado.close();
}
}
