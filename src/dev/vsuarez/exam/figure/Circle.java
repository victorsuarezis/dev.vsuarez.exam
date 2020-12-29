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
public class Circle extends Figure implements IGeometricFigure {

	/**
	 * @param surface
	 * @param base
	 * @param height
	 * @param diameter
	 * @param code
	 * @param name
	 */
	public Circle(BigDecimal base, BigDecimal height, BigDecimal diameter, String code,
			String name) {
		super(base, height, diameter);
	}

	@Override
	public String getName() {
		return CIRCLE_NAME;
	}

	@Override
	public String getCode() {
		return CIRCLE_CODE;
	}

	@Override
	public void setDiameter(BigDecimal diameter) {
		super.setDiameter(diameter);
	}

	@Override
	public BigDecimal getDiameter() {
		return super.getDiameter();
	}

	@Override
	public BigDecimal getArea(BigDecimal base, BigDecimal height, BigDecimal diameter) {
		if(diameter == null)
			diameter = BigDecimal.ZERO;
		return getArea(diameter);
	}

	@Override
	public BigDecimal getArea() {
		BigDecimal diameter = getDiameter();
		if(diameter == null)
			diameter = BigDecimal.ZERO;
		return getArea(diameter);
	}

	private BigDecimal getArea(BigDecimal diameter) {
		BigDecimal pi = new BigDecimal(Math.PI);
		return pi.multiply(diameter.pow(2).divide(new BigDecimal(4), 12, RoundingMode.HALF_UP));
	}
}
