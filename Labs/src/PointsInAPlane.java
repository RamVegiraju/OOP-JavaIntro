
public class PointsInAPlane {
	
	public static double points(double x, double y) {
		double answer = 0;
		if (x > 0 && y > 0) {
			answer = (x * y);
		}else if (x < 0 && y >= 0) {
			answer = (x - y);
		}else if (x < 0 && y < 0) {
			answer = (x / y);
		}else
			answer = (x + y);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(points(4.4,5.5)); //if both x and y are greater than or equal to 0
		System.out.println(points(-3.2,4.0)); //if x is less than 0 and y is greater than or equal to 0
		System.out.println(points(-3.5,-4.0)); // if x and y are less than 0
		System.out.println(points(4,-3)); // all other cases, example x > 0 and y < 0

	}

}
