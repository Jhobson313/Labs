package co.grandcircus.triangle;

public class Triangle {
	
	//camelCase: variables,methods
	//PascalCase: Classes 
	
	public static final int numberOfSides = 3;
	public double base;
	public double height;
	public double getArea(){
		return base*height /2;
	}
	public String toString(){
		return "Triangle(base="+ base +",height="+ height +",nos"+ numberOfSides;
				}
	public static double getCombinedArea(Triangle a, Triangle b){
		return a.getArea() + b.getArea() ;
	}
	}

