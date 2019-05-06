import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	private static String formatNumber(double x) {
		String formatted = String.format("%.2f", x);
		return formatted;
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
}
