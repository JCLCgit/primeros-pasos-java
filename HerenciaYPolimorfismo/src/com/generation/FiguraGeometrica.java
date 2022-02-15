package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas
	//LA clase abstracta no puede crear objetos
	//Clases que pueden o no contener m�todo abstractos
	//uso com�n, es para heredar
	//M�todo abstracto es un m�todo que te dice qu� vas a hacer
	//pero no c�mo hacerlo
	
	private String nombre;
	private float alto;
	private float largo;
	
//	public FiguraGeometrica() {
//		
//	}
	
	public FiguraGeometrica(String nombre) {
		this.nombre=nombre;
	}
	
	public abstract float calcularArea();
	
	public abstract float perimetro();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
}
