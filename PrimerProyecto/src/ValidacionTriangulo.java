import java.util.Scanner;
public class ValidacionTriangulo {
	public static void main(String[] args) {
		
		float n1,n2,n3,mayor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer ángulo a evaluar");
		n1=sc.nextFloat();
		System.out.println("Dame el segundo ángulo a evaluar");
		n2=sc.nextFloat();
		System.out.println("Dame el tercer ángulo a evaluar");
		n3=sc.nextFloat();
		
		mayor=n1+n2+n3;
		if(mayor==180) {
			System.out.println("Es un triángulo");
		}
		else {
			System.out.println("NO Es un triángulo");
		}
		
	}
}
