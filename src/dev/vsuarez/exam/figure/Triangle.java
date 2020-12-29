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
public class Triangle extends Figure implements IGeometricFigure {

	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Triangle(BigDecimal surface, BigDecimal base, BigDecimal height, BigDecimal diameter, String code,
			String name) {
		super(surface, base, height, diameter);
	}

	@Override
	public String getName() {
		return TRIANGLE_NAME;
	}

	@Override
	public String getCode() {
		return TRIANGLE_CODE;
	}

}
