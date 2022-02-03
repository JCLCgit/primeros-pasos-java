package Ciclos;
import java.util.Scanner;
public class DeletreaNombre {
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		System.out.println("Dame la cadena");
		String cadena1 =cin.nextLine();
		for(int i=0;i<cadena1.length();i++) {
			char letra= cadena1.charAt(i);
			System.out.println(letra);
		}
		
	}
}
