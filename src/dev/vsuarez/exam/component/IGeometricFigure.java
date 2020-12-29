/**
 * 
 */
package dev.vsuarez.exam.component;

import java.math.BigDecimal;

/**
 * Interface for Geometric Figure
 * @author <a href="mailto:victor.suarez.is@gmail.com">Ing. Victor Suarez</a>
 *
 */
public interface IGeometricFigure {
	
	/**
	 * Set Surface
	 * @param surface
	 */
	public void setSurface(BigDecimal surface);
	
	/**
	 * Get Surface
	 * @return BigDecimal surface
	 */
	public BigDecimal getSurface();
	
	/**
	 * Set Base
	 * @param base
	 */
	public void setBase(BigDecimal base);
	
	/**
	 * Get Base
	 * @return BigDecimal base
	 */
	public BigDecimal getBase();
	
	/**
	 * Set Height
	 * @param height
	 */
	public void setHeight(BigDecimal height);
	
	/**
	 * Get Height
	 * @return BigDecimal height
	 */
	public BigDecimal getHeight();
	
	/**
	 * Set Diameter
	 * @param diameter
	 */
	public void setDiameter(BigDecimal diameter);
	
	/**
	 * Get Diameter
	 * @return BigDecimal diameter
	 */
	public BigDecimal getDiameter();
	
//	/**
//	 * Set Type of Figure
//	 * @param typeOfFigure
//	 */
//	public void setTypeOfFigure(String typeOfFigure);
//	
//	/**
//	 * Get Type Of Figure
//	 * @return BigDecimal Type Of Figure
//	 */
//	public Figure getTypeOfFigure();
	
	/**
	 * Get Name
	 * @return String Name
	 */
	public String getName();
	
	/**
	 * Get Code
	 * @return String code
	 */
	public String getCode();
	
	/**
	 * Get Area
	 * @param base
	 * @param height
	 * @param diameter
	 * @return BigDecimal Area
	 */
	public BigDecimal getArea(BigDecimal base, BigDecimal height, BigDecimal diameter);
	
	/**
	 * Get Area
	 * @return BigDecimal Area
	 */
	public BigDecimal getArea();
	
	/**
	 * Get ID
	 * @return int ID
	 */
	public int getId();
	
	/**
	 * Set ID
	 * @param ID
	 */
	public void setID(int ID);

}
