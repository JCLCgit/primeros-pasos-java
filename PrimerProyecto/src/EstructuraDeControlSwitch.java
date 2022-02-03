import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	//Estructuras de control nos sirve para 
	//controlar el flujo de comportamiento de un programa.
	//Para la toma de decisiones
	/*
	 * Switch(condicion_a_evaluar){
	 * 	case"valor":
	 * 		código a ejecutar
	 *		break
	 *  case"n":
	 * 		código a ejecutar
	 *		break
	 * 	default:
	 * 		código a ejecutar
	 * }
	 */
	//Soliciatar al usuario día de la semana y msotrar mensaje
	
	public static void main(String[] args ) {
		System.out.println("Introduce un día");
		Scanner sc= new Scanner(System.in);
		String dia=sc.nextLine();
		dia=dia.toLowerCase();
		switch(dia) {
		case "lunes":
			System.out.println("Ya es LUNES");
			break;
		case "martes":
			System.out.println("Lunes HERMANO");
			break;
		case "miercoles":
			System.out.println("MIÉRCOLES, pero a qué costo");
			break;
		case "jueves":
			System.out.println("Ya es JUEBEBES");
			break;
		case "viernes":
			System.out.println("Viernes de besos");
			break;
		case"sabado":
		case"domingo":
			System.out.println("Basta");
			break;
		default:
			System.out.println("Dato no VáLIDO");
		
		}
		
	}
}
