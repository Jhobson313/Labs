/**
 * @see @param
 * @author James Hobson
 * @version 1.0
 */

public class Circle {
	/**
	 * 
	 */
	public double radius;
	/**
	 * @param instance required to complete the circle class and get the circumference or area 
	 */
	public double circumference;
	public double area;
	public final double  PI = 3.14;
	static int count ;
	private static int ObjectCount = 0;
	
	public Circle(double radius)
	{
		this.radius = radius;
		++ObjectCount;
	}
		
	
	public double getCircumference()
	{
		circumference =  (2 * PI * radius);
		
		 return circumference;
		/**
		 * calculate the circumference of the circle
		 */
	}
	
	public String getFormattedCircumference()
	{
		getCircumference();
		return formatNumber(circumference);
	}
	
	public double getArea()
	{
		area =  (PI * radius * radius );
		 return area;
		
	}
	public String getFormattedArea()
	{
		getArea();
		return formatNumber(area);
	}
	private String formatNumber(double x)
	{
		String result = String.format("%.2f", x);
		return result;
	}
	
	public static  int getObjectCount()
	{
		
		return ObjectCount;
	}

}
