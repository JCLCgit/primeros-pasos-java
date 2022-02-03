package arreglos;
//LOS ARREGLOS SON OBJETOS, y las funciones son como manejar
//propiedades
public class Arreglos {
	public static void main(String[] args) {
		//Solo un tipo de dato
		//especificar el tamaño o la cantidad de elementos 
		//que va a contener
		
		//1 manera 
		int numeros[];//creamos la variable
		numeros= new int[4];//creando el arreglo
		
		//2 manera
		String[] nombres= new String[4];// 0,1,2,3
		
		//3 manera
		//array literal
		String []nombreFrutas=new String[] {"pera","uva","manzana","plátano"};
		
		
		numeros[0]=5;
		numeros[1]=15;
		numeros[2]=52;
		numeros[3]=25;
		
		nombres[0]="Juan";
		nombres[1]="Pedro";
		nombres[2]="Antonio";
		nombres[3]="Antonio2";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros);
		
		for(int i=0; i<numeros.length;i++) {//en arrays, length es una propiedad
			
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(nombreFrutas[i]);
			
		}
		
		
	}
	

}
