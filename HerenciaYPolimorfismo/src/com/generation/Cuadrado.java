package com.generation;

public class Cuadrado extends FiguraGeometrica{

	public Cuadrado() {
		super("Cudrado");
	}

	@Override
	public float calcularArea() {
		
		return getAlto()*getLargo();
	}

	@Override
	public float perimetro() {
		
		return getAlto()*4;
	}
}
