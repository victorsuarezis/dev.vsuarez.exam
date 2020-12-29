/**
 * 
 */
package dev.vsuarez.exam.figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

import dev.vsuarez.exam.component.IGeometricFigure;

/**
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
public class Triangle extends Figure implements IGeometricFigure {
	
	public static final String TRIANGLE_NAME = "Triangulo";
	public static final String TRIANGLE_CODE = "T";

	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Triangle(BigDecimal base, BigDecimal height, int ID) {
		super(base, height, null, ID);
	}
	
	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Triangle(BigDecimal base, BigDecimal height) {
		super(base, height, null);
	}

	@Override
	public String getName() {
		return TRIANGLE_NAME;
	}

	@Override
	public String getCode() {
		return TRIANGLE_CODE;
	}

	@Override
	public BigDecimal getArea(BigDecimal base, BigDecimal height, BigDecimal diameter) {
		if(base == null)
			base = BigDecimal.ZERO;
		if(height == null)
			height = BigDecimal.ZERO;
		return base.multiply(height).divide(new BigDecimal(2), 12, RoundingMode.HALF_UP);
	}

	@Override
	public BigDecimal getArea() {
		BigDecimal base = getBase();
		BigDecimal height = getHeight();
		if(base == null)
			base = BigDecimal.ZERO;
		if(height == null)
			height = BigDecimal.ZERO;
		return base.multiply(height).divide(new BigDecimal(2), 12, RoundingMode.HALF_UP);
	}

}
