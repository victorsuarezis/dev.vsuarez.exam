/**
 * 
 */
package dev.vsuarez.exam.main;

import java.math.BigDecimal;
import java.util.Scanner;

import dev.vsuarez.exam.component.IGeometricFigure;
import dev.vsuarez.exam.figure.Circle;
import dev.vsuarez.exam.figure.Square;
import dev.vsuarez.exam.figure.Triangle;

/**
 * Main Class
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
public class BuildFigure {
	
	public static IGeometricFigure figure;
	public static BigDecimal base = BigDecimal.ZERO;
	public static BigDecimal height = BigDecimal.ZERO;
	public static BigDecimal diameter = BigDecimal.ZERO;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		base = new BigDecimal(25);
		height = new BigDecimal(30);
		diameter = new BigDecimal(40);
		
        System.out.println ("----- FIGURAS GEOMETRICAS -----");
        System.out.println ("Por favor Seleccione una Figura: Circulo (C), Triangulo(T) o Cuadrado(S)");
        String selection = "";
        Scanner in = new Scanner (System.in);
        selection = in.nextLine ();
        
        if("C".equalsIgnoreCase(selection)) {
        	System.out.println("La Figura seleccionada es: " + Circle.CIRCLE_NAME);
        	System.out.println ("Ingrese Diametro: ");
        	Scanner inF = new Scanner (System.in);
            String diameterStr = inF.nextLine ();
            inF.close();
            base = null;
            height = null;
        	diameter = BigDecimal.ZERO;
            if(diameterStr != null && !diameterStr.isEmpty())
            	diameter = new BigDecimal(diameterStr);
            
        	Circle circle = new Circle(diameter);
        	figure = circle;
        } else if("T".equalsIgnoreCase(selection)) {
        	System.out.println("La Figura seleccionada es: " + Triangle.TRIANGLE_NAME);
        	System.out.println ("Ingrese Base: ");
        	Scanner inF = new Scanner (System.in);
        	String baseStr = inF.nextLine ();
        	System.out.println ("Ingrese Altura: ");
        	String heightStr = inF.nextLine ();
        	inF.close();
        	base = BigDecimal.ZERO;
        	height = BigDecimal.ZERO;
        	if(baseStr != null && !baseStr.isEmpty())
        		base = new BigDecimal(baseStr);
        	if(heightStr != null && !heightStr.isEmpty())
        		height = new BigDecimal(heightStr);
        	
        	Triangle triangle = new Triangle(base, height);
        	figure = triangle;
        } else if("S".equalsIgnoreCase(selection)) {
        	System.out.println("La Figura seleccionada es: " + Square.SQUARE_NAME);
        	System.out.println ("Ingrese Base: ");
        	Scanner inF = new Scanner (System.in);
        	String baseStr = inF.nextLine ();
        	inF.close();
        	base = BigDecimal.ZERO;
        	if(baseStr != null && !baseStr.isEmpty())
        		base = new BigDecimal(baseStr);
        	Square square = new Square(base);
        	figure = square;
        } else {
        	System.out.println("Entrada no Valida");
            in.close();
        	return;
        }
        in.close();
        BigDecimal area = figure.getArea();
        if(area == null)
        	area = BigDecimal.ZERO;
        
        System.out.println( "Su Area es: " + area);

	}

}
