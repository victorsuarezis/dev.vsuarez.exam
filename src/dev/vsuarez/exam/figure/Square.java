/**
 * 
 */
package dev.vsuarez.exam.figure;

import java.math.BigDecimal;

import dev.vsuarez.exam.component.IGeometricFigure;

/**
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
public class Square extends Figure implements IGeometricFigure {
	
	public static final String SQUARE_NAME = "Cuadrado";
	public static final String SQUARE_CODE = "S";

	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Square(BigDecimal base, int ID) {
		super(base, null, null, ID);
	}
	
	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Square(BigDecimal base) {
		super(base, null, null);
	}

	@Override
	public String getName() {
		return SQUARE_NAME;
	}

	@Override
	public String getCode() {
		return SQUARE_CODE;
	}

	@Override
	public BigDecimal getArea(BigDecimal base, BigDecimal height, BigDecimal diameter) {
		if(base == null)
			base = BigDecimal.ZERO;
		return base.pow(2);
	}

	@Override
	public BigDecimal getArea() {
		BigDecimal base = getBase();
		if(base == null)
			base = BigDecimal.ZERO;
		return base.pow(2);
	}

}
