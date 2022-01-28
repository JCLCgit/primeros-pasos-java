import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		int n1,n2,n3,mayor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer número a evaluar");
		n1=sc.nextInt();
		System.out.println("Dame el segundo número a evaluar");
		n2=sc.nextInt();
		System.out.println("Dame el tercer número a evaluar");
		n3=sc.nextInt();
		
		if(n1>=n2&&n1>=n3){
			mayor=n1;
		}
		else{
			if(n2>n3&&n2>n1) {
				mayor=n2;
			}
			else {
				mayor=n3;
			}
		}
		
		
		System.out.println("Este es el MAYOR:"+mayor);
		
	}
}
