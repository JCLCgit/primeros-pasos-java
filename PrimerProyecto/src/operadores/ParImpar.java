package operadores;

import java.util.Scanner;

public class ParImpar {

public static void main(String[] args) {
		
		System.out.println("Dame El número que deseas analizar ");
		int numero1;

        Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner

        numero1 = entrada.nextInt(); 

		
		if((numero1 % 2) != 0) {
			
			System.out.println("No es par");
			
			
		}else {
			System.out.println("Es par");
		}
		
		
	}
	
}
