import java.util.Scanner;

public class RestaSimple {
public static void main(String[] args) {
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor, introduce el primer n�mero: ");
	num1 = sc.nextInt();
	//Pido el primer n�mero
	System.out.println("Por favor, introduce el segundo n�mero: ");
	num2 = sc.nextInt();
	//Pido el segundo n�mero
	if (num1==num2){
		System.out.println("Los dos n�meros introducidos son iguales");
	}
	else if (num1>num2) 
		System.out.printf("La resta es: %d",(num1-num2));
	else System.out.printf("La resta es: %d",(num2-num1));
	//Cierro el objeto scanner
	sc.close();
}
}
