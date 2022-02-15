package com.generation;

public  class Triangulo extends FiguraGeometrica{

	public Triangulo() {
		super("Triangulo");//super llama al constructor PADRE
	}
	
	@Override  //ESto es para Aplicar polimorfismo
	public float calcularArea() {
		//return alto*largo/2;  AQUÏ habría que poner PROTECTED
		return (getAlto()*getLargo()/2);
	}

	@Override
	public float perimetro() {
		
		return 0;
	}
}
