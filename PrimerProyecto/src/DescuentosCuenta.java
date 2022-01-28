// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la copra es de 10000 o más 30%



import java.util.Scanner;
public class DescuentosCuenta {
	public static void main(String[] args) {
		
		double total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el total a pagar");
		total=sc.nextDouble();
		
		if(total<1000) {
			System.out.println("No hay descuento, el total a pagar es:$"+total);
		}
		else if(total>=1000 && total<=4999) {
			total=total*(0.9);
			System.out.println("El descuento aplicado es de 10%, el total a pagar es:$"+total);
		}
		else if(total>=5000 && total<=9999) {
			total=total*.8;
			System.out.println("El descuento aplicado es de 20%, el total a pagar es:$"+total);
		}
		else {
			total=total*.7;
			System.out.println("El descuento aplicado es de 30%, el total a pagar es:$"+total);
		}
		
	}
}
