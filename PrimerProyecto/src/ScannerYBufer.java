import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nomrbe");
		String nombre=sc.nextLine();//también se puede con .next();
		System.out.println("Introduce un número");
		int numero1=sc.nextInt();
		
		//LIMPIAR BUFER sc.nextline();
		System.out.println("Tu nombre es:"+nombre+" Tu número es:"+numero1);
		
		sc.close();
		/*System.out.println("Introduce otro número");
		int numero2=sc.nextInt();
		
		System.out.println("Número 1"+numero1+"Número 2"+numero2);
		*/
	}
}
