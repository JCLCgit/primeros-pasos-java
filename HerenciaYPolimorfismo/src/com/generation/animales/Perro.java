package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la pelota");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");
		
	}

	@Override
	public void banar() {
		System.out.println("Me gusta el agua");
		
	}

	@Override
	public void moverLaColita() {
		System.out.println("Sí muevo la colita");
		
	}

	@Override
	public void jugarConCajas() {
		System.out.println("No juego con cajas");
		
	}

	@Override
	public void ensuciarse() {
		System.out.println("Sí me gusta ENSUCIARME");
		
	}

}
