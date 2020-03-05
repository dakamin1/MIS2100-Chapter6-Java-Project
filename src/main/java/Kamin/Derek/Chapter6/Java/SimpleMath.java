package Kamin.Derek.Chapter6.Java;

public class SimpleMath {

	public double divide(double n, double d) {
		if(d == 0) {
			throw new ArithmeticException();
		}
		return n/d;
		
	}
}
