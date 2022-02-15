package com.generation.animales;

public class Gato extends Animal implements Mascota {
	
	@Override
	public void jugar() {
		System.out.println("Estoy jugando con cajas");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo la luz");
		
	}

	@Override
	public void banar() {
		System.out.println("No me gusta el agua");
		
	}
}
