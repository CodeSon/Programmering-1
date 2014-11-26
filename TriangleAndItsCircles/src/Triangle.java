import java.util.*;

public class Triangle {

	// method for circumcircleRadius

	public static double circumcircleRadius(double sideA, double sideB,
			double sideC)

	{
		double t = (sideA * sideB * sideC);

		double sum = (sideA + sideB + sideC) * (sideB + sideC - sideA)
				* (sideC + sideA - sideB) * (sideA + sideB - sideC);

		double s = t / Math.sqrt(sum);

		return s;

	}

	// method for the radius of the inner circle of the triangle

	public static double innerCircleRadius(double sideA, double sideB,
			double sideC) {
		double k = perimeter(sideA, sideB, sideC) / 2;

		double r = k * (k - sideA) * (k - sideB) * (k - sideC);

		double radius = Math.sqrt(r) / k;
		return radius;

	}

	// method for the perimeter of the inner circle of the triangle
	public static double perimeter(double sideA, double sideB, double sideC) {

		double sides = sideA + sideB + sideC;

		return sides;
	}

	// // method for the bisector of the triangle of the triangle
	public static double bisector(double b, double c, double alpha) {
		double p = 2 * b * c * Math.cos(alpha / 2);
		double bis = p / (b + c);
		return bis;
	}

	// method for the area of the triangle
	public static double area(double sideA, double sideB, double sideC) {
		double v = perimeter(sideA, sideB, sideC) / 2;
		double half = Math.sqrt(v * (v - sideA) * (v - sideB) * (v - sideC));
		return half;
	}

}
