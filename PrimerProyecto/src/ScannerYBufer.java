import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nomrbe");
		String nombre=sc.nextLine();//tambi�n se puede con .next();
		System.out.println("Introduce un n�mero");
		int numero1=sc.nextInt();
		
		//LIMPIAR BUFER sc.nextline();
		System.out.println("Tu nombre es:"+nombre+" Tu n�mero es:"+numero1);
		
		sc.close();
		/*System.out.println("Introduce otro n�mero");
		int numero2=sc.nextInt();
		
		System.out.println("N�mero 1"+numero1+"N�mero 2"+numero2);
		*/
	}
}
