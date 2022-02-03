import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	//Estructuras de control nos sirve para 
	//controlar el flujo de comportamiento de un programa.
	//Para la toma de decisiones
	/*
	 * Switch(condicion_a_evaluar){
	 * 	case"valor":
	 * 		c�digo a ejecutar
	 *		break
	 *  case"n":
	 * 		c�digo a ejecutar
	 *		break
	 * 	default:
	 * 		c�digo a ejecutar
	 * }
	 */
	//Soliciatar al usuario d�a de la semana y msotrar mensaje
	
	public static void main(String[] args ) {
		System.out.println("Introduce un d�a");
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
			System.out.println("MI�RCOLES, pero a qu� costo");
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
			System.out.println("Dato no V�LIDO");
		
		}
		
	}
}
