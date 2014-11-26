import java.util.Scanner;

/**
 * 
 */

/**
 * @author David Nartey
 *
 */
public class TriangleAndItsCircles {

	public static void main(String[] args) {

		System.out.println("TRIANGLE CALCULATIONS\n");
		Scanner in = new Scanner(System.in);

		// retrieving and storing user input to calculate the radius of the
		// circumscribed circle of a triangle
		System.out
				.println("Please enter the lenght of the first side of the triangle");
		double sideA = in.nextDouble();
		System.out
				.println("Please enter the lenght of the second side of the triangle");
		double sideB = in.nextDouble();
		System.out
				.println("Please enter the lenght of the third side of the triangle");
		double sideC = in.nextDouble();
		// computing and printing the outer radius

		double circumcircleRadius = Triangle.circumcircleRadius(sideA, sideB,
				sideC);
		System.out.println("The radius of the triangle's circumcircle is "
				+ circumcircleRadius + "\n");
		System.out.println("whiles");
		System.out.println();
		// computing and printing the inner radius

		double innerCircleR = Triangle.innerCircleRadius(sideA, sideB, sideC);
		System.out.println("the radius of the triangle's inner circle is "
				+ innerCircleR);

		// perimeter of a triangle
		double sides = Triangle.perimeter(sideA, sideB, sideC);
		System.out.println("The perimeter of the riangle is " + sides);

		// Bisector of the triangle
		System.out.println("the bisector of the triangle "
				+ Triangle.bisector(sideA, sideB, Math.PI / (2)));

		// the area of a triangle
		System.out.println("The area of the triangle is "
				+ Triangle.area(sideA, sideB, sideC));

	}
}
