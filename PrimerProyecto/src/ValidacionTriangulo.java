import java.util.Scanner;
public class ValidacionTriangulo {
	public static void main(String[] args) {
		
		float n1,n2,n3,mayor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer �ngulo a evaluar");
		n1=sc.nextFloat();
		System.out.println("Dame el segundo �ngulo a evaluar");
		n2=sc.nextFloat();
		System.out.println("Dame el tercer �ngulo a evaluar");
		n3=sc.nextFloat();
		
		mayor=n1+n2+n3;
		if(mayor==180) {
			System.out.println("Es un tri�ngulo");
		}
		else {
			System.out.println("NO Es un tri�ngulo");
		}
		
	}
}
