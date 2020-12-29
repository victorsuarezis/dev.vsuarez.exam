/**
 * 
 */
package dev.vsuarez.exam.figure;

import java.math.BigDecimal;

import dev.vsuarez.exam.component.IGeometricFigure;

/**
 * Class for define Figures
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
public abstract class Figure implements IGeometricFigure {
	
	public static final String CIRCLE_NAME = "Circulo";
	public static final String SQUARE_NAME = "Cuadrado";
	public static final String TRIANGLE_NAME = "Triangulo";
	public static final String CIRCLE_CODE = "C";
	public static final String SQUARE_CODE = "S";
	public static final String TRIANGLE_CODE = "T";
	
	/**
	 * Surface
	 */
	private BigDecimal surface = null;
	
	/**
	 * Base
	 */
	private BigDecimal base = null;
	
	/**
	 * Height
	 */
	private BigDecimal height = null;
	
	/**
	 * Diameter
	 */
	private BigDecimal diameter = null;
	
//	/**
//	 * Code of Figure
//	 */
//	public String code = null;
//	
//	/**
//	 * Name of Figure
//	 */
//	public String name = null;

//	/**
//	 * @param code the code to set
//	 */
//	public void setCode(String code) {
//		this.code = code;
//	}
	
	/**
	 * Constructor
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Figure(BigDecimal base, BigDecimal height, BigDecimal diameter) {
		super();
		this.base = base;
		this.height = height;
		this.diameter = diameter;
//		this.code = code;
//		this.name = name;
	}
	
//	/**
//	 * @return the code
//	 */
//	public String getCode() {
//		return this.code;
//	}
//
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return this.name;
//	}

	@Override
	public void setSurface(BigDecimal surface) {
		this.surface = surface;
	}

	@Override
	public BigDecimal getSurface() {
		return this.surface;
	}

	@Override
	public void setBase(BigDecimal base) {
		this.base = base;
	}

	@Override
	public BigDecimal getBase() {
		return this.base;
	}

	@Override
	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	@Override
	public BigDecimal getHeight() {
		return this.height;
	}

	@Override
	public void setDiameter(BigDecimal diameter) {
		this.diameter = diameter;
	}

	@Override
	public BigDecimal getDiameter() {
		return this.diameter;
	}

//	@Override
//	public void setTypeOfFigure(String typeOfFigure) {
//		this.ty
//	}
//
//	@Override
//	public Figure getTypeOfFigure() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
