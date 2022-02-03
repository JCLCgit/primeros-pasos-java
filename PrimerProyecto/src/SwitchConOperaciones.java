import java.util.Scanner;
/*
 * Pedir al usuario 2 números por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y despues imprimir el resultado
 */
public class SwitchConOperaciones {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b,resultado;
		int c;
		System.out.println("Dame el número 1");
		a= sc.nextFloat();
		System.out.println("Dame el número 2");
		b= sc.nextFloat();
		System.out.println("Selecciona la operación: 1)Suma,2)Resta,3)División,4)Multiplicación");
		c= sc.nextInt();
		
		switch(c) {
		case 1:
			resultado=a+b;
			System.out.println("Tu resultado es:"+resultado);
			break;
		case 2:
			resultado=a-b;
			System.out.println("Tu resultado es:"+resultado);
			break;
		case 3:
			resultado=a/b;
			System.out.println("Tu resultado es:"+resultado);
			break;
		case 4:
			resultado=a*b;
			System.out.println("Tu resultado es:"+resultado);
			break;
		default:
			System.out.println("ERROR de entrada");
		}
		
	}
}
