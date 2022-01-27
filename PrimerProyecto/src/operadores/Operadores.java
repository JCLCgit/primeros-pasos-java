package operadores;
import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritm�ticos
		//+,-,/,*,%
		
		int a =10;
		int b=20;
		double c=10.5;
		
		int suma=a+b;
		System.out.println(suma);
		
		String str1="El resultado de la suma es:";
		System.out.println(str1+suma);
		
		//Resta
		System.out.println("El resultado de la resta:" + (a-b));
		
		//divisi�n
		int division=a/b;
		System.out.println("El resultado de la division es:"+division);
		
		//double division2= (double)a/b;
		double division2=c/b;
		//por lo menos UNO de los DOS datos debe ser de tipo double
		//10.0/20=0.5
		System.out.println("el resultado de la divis�n es:"+division2);
		
		//multiplicaci�n
		double multiplicacion=c*a;
		System.out.println("el resultado de la mult es:"+multiplicacion);
		
		
		//m�dulo
		double modulo=a%c;
		System.out.println("El m�dulo de la operaci�n es:"+ modulo);
		
		//Operador de asignaci�n =
		
		int d=5,e; //inicializar las variables vac�as
		e=6;
		System.out.println(d+"-"+e);
		
		//Operadores de declaraci�n compuesta
		//+=,-=,/=,*=,%=
		
		int f=0,g=5;
		f+=5;
		//f=f+5
		System.out.println(f);
		
		//Operadores relacionales
		//<,>, <=, >=
		//== igualdad
		//!= diferencia
		// Resultado, un valor de tipo boolean(true,false)
		
		int h=15, i=25;
		String j="Hola";
		
		System.out.println(h>1);//false
		System.out.println(i!=h);
		//System.out.println(h!=j);//son valores distintos y no se pueden comparar
		
		//Operador unario ++ y --
		//preasignaci�n
		//postasignaci�n
		
		int k=0,l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Precedencia de operadores
		int operacion=4+5*6/3;
		
		System.out.println(operacion);
		
		int x=0, y=0;
		int operacion2= ++x + y--;
		System.out.println(operacion2);//1
		
		//Operador ternario
		//solo nos permite tomar una decisi�n
		int edad=19,valor=0;
		int resultado= (edad<=18) ? (valor=1) : (valor=2);
		//par�ntesis son opcionales
		System.out.println(resultado);
		
		//Operadores L�gicos
		//And && 
		//Or - ||
		//Not !
		
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(true||false);//true
		System.out.println(true&&!false);//true
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un n�mero");
		int num= sc.nextInt();
		System.out.println(num);
		
		
		
		
	}
}
