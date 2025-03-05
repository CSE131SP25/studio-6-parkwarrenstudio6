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
	public static void circlesUponCircles(double x, double y, double radius, double threshold) {
		double bound = 7.0;
		StdDraw.setXscale(-bound, bound);
		StdDraw.setYscale(-bound, bound);
		int r = (Math.random() * 255);
		int g = (Math.random() * 255);
		int b = (Math.random() * 255);
		
		StdDraw.setPenColor(r, g, b);
			if (radius <= threshold) {
		        return; // Base case: stop when the radius is too small
		    }
	
			// Draw the current circle
		    StdDraw.circle(x, y, radius);
		    
		    // Recursive calls for the four directions with a reduced radius
		    double newRadius = radius / 1.2;
		    circlesUponCircles(x + radius, y, newRadius, threshold); // Right
		    circlesUponCircles(x - radius, y, newRadius, threshold); // Left
		    circlesUponCircles(x, y + radius, newRadius, threshold); // Up
		    circlesUponCircles(x, y - radius, newRadius, threshold); // Down	
		    
		    
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
		
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
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	public static void main(String[] args) {
		circlesUponCircles(0, 0, 3, .5);
	}
}
