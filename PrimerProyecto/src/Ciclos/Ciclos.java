package Ciclos;

public class Ciclos {
	public static void main(String[] args) {
		
		//while
		
		/*
		int control=0;
		while(control<10) {
			System.out.println("control="+ control);
			control++;
		}
		*/
		//do while
		
		/*int control=3;
		
		do {
			//código a ejecutar
			System.out.println("Control ="+control);
			//modificador de la variable control
			control++;
			
		}while(control<3);
		*/
		
		//FOR
		/*for(int i=0;i<3;i++) {
			System.out.println("control="+i);
		}
		*/
		//break & continue
		/*for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("control="+i);
				break;
			}
			
		}
		*/
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				
				continue;//SALTA EL CICLO
			}
			System.out.println("control="+i);
		}
		
		for(int i=0;i<10;i++) {
			
			System.out.println("control="+i);
			continue;
		}
	}
}
