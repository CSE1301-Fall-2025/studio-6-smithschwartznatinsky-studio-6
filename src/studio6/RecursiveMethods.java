package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			return 0;
		
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		
		// FIXME complete the recursive drawing
		if (radius < radiusMinimumDrawingThreshold) {
			return;
		}
		StdDraw.circle(xCenter, yCenter, radius);
		circlesUponCircles(xCenter + radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter - radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter + radius, radius / 3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter - radius, radius / 3, radiusMinimumDrawingThreshold);
	
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array

			int[] reversed = new int[array.length];
			reverseHelper(array, reversed, 0);
			return reversed;

		
	}

	/**
	 * Helper that fills dest with elements of src in reverse order.
	 * @param src source array (not modified)
	 * @param dest destination array to fill
	 * @param index current index to write in dest (and mirrored read from src)
	 */
	private static void reverseHelper(int[] src, int[] dest, int index) {
		if (index >= src.length) {
			return;
		}
		dest[index] = src[src.length - 1 - index];
		reverseHelper(src, dest, index + 1);
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			if (p < 0) p = -p;
			if (q < 0) q = -q;
			if (q == 0) {
				return p;
			}
			return gcd(q, p % q);
		
	}


}