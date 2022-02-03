package colecciones;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Colecciones {
	public static void main(String[] args) {
		
		//Las colecciones nos sirven para almacenar un conjunto
		//de objetos
		//La diferencia de las colecciones y los objetos
		//es que las colecciones son din�micas, pueden cambiar
		//el n�mero de objetos agregados
		
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repetidos
		
		
		//HashSet
		//los elementos no mantienen un orden
		//ES la implementaci�n m�s r�pida
		/*
		Set<String> frutas= new HashSet<String>();
		frutas.add("mango");
		frutas.add("sand�a");
		frutas.add("pi�a");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		//forEach,puede recorrer una colecci�n y en cada
		//recorrido recupera el valor y lo podemos almacenar
		//en una variable
		//Sintaxis
		//for( tipoDeDatoElemento variable:elementoARecorrer)
		/*
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		*/
		//TreeSet
		//Esta implementaci�n ordena los elementos en funci�n 
		//de sus valores
		//es la implementaci�n m�s lenta
		
		/*
		Set<String> frutas= new TreeSet<String>();
		frutas.add("mango");
		frutas.add("sand�a");
		frutas.add("pi�a");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		*/
		
		//LinkedHashSet
		//ordena los elementos en orden de inserci�n
		// es m�s costoso en velocidad que HashSet
		
		/*
		Set<String> frutas= new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("sand�a");
		frutas.add("pi�a");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		
		//Orden de velocidad 
		//1.HashSet
		//2.LinkedHashSet
		//3.TreeSet
		*/
		
		//List 
		//se permiten elementos duplicados
		//acceder a elementos espec�ficos
		//buscar elementos
		
		
		//ArrayList
		
		List<String> pokemones=new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizar");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		//add si agregamos un �ndice y elemento,
		//posiciona el elemento en el �ndice dado y 
		//realiza un desplazamiento, es decir NO BORRA
		//el elemento sino que lo desplaza
		
		pokemones.add(2,"Pikachu");
		//remove, remueve el elemento de la posici�n
		//especificada
		pokemones.remove(5);
		
		//set, reemplza el elemento en la posici�n especificada
		pokemones.set(0,"Chikorita");
		
		for(String pokemon:pokemones) {
			System.out.println(pokemon);
		}
		System.out.println("************");
		System.out.println(pokemones.get(2));
		
		//indexOf, nos va a devolver la posici�n del
		//elemento y si el elemento no se encuentra,
		//nos devuelve -1
		
		System.out.println(pokemones.indexOf("Togepi"));
		System.out.println(pokemones.lastIndexOf("Gengar"));
		
		System.out.println("************");
		
		//LinkedList
		// es una lista doblemente enlazada
		//es m�s r�pido para insertar y remover elementos
		List<String> digimones=new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");		
		digimones.add("Andromon");
		digimones.add("greymon");
		
		//MAP
		//Asocia Claves a valores.
		//no puede contener claves duplicadas
		//S�lo puede tener un valor asociado
		
		//HashMap
		//tiene mejor rendimiento pero no garantizca un orden
		// a la hora de hacer iteraciones
		
		Map<Integer,String> usuarios= new HashMap<Integer,String>();
		usuarios.put(1123, "Juan Carlos");
		usuarios.put(3242, "Raul");
		usuarios.put(3243, "Ro");
		
		System.out.println(usuarios.get(1123));
		
		//keySet
		//Nos permite recuperar el valor de la clave
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		//TreeMap
		//lleva un orden conforme los valores de la clave
		Map<String,String>tamales=new TreeMap<String,String>();
		tamales.put("Oaxaque�o","Mole Rojo");
		tamales.put("Torta","Mole Verde");
		tamales.put("Dulces","Gansito");
		tamales.put("Salado","Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento ->{//funcion Lambda
			System.out.println(elemento);
		});
		
		//LinkedHashMap
		Map<Integer,String> carros=new LinkedHashMap<Integer,String>();
		//guarda los elementos, seg�n el orden en el que se inserten
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(4, "Mustang");
		
		System.out.println("****************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}
	


}
