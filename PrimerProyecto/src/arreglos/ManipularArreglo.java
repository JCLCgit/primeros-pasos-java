/*
 * Crea una clase llamara ManipularArreglo
crea un array con los siguientes números enteros:

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo 
y devuelva la suma total, la suma de los números pares y la suma de
 los números impares.


 */

package arreglos;

public class ManipularArreglo {
	public static void main(String[] args) {
		int arreglo[];
		arreglo=new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int suma=0,sumaPar=0,sumaImpar=0;
		for(int i=0;i<arreglo.length;i++) {
			suma+=arreglo[i];
			if(arreglo[i]%2==0) {
				sumaPar+=arreglo[i];
			}
			else {
				sumaImpar+=arreglo[i];
			}
			
		}
		System.out.println("Esta es la suma total:"+suma);
		System.out.println("Esta es la suma total:"+sumaPar);
		System.out.println("Esta es la suma total:"+sumaImpar);
		
	}
}
