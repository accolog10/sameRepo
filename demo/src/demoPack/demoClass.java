package demoPack;

public class demoClass implements demoInterface {

	@Override
	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	public static void main(String[] args) {
		demoInterface obj = new demoClass();
		System.out.println(1 + " + " + 1 + " = " + obj.add(1, 1));
		System.out.println(1 + " - " + 1 + " = " + obj.sub(1, 1));
		System.out.println(2 + " * " + 5 + " = " + obj.multiply(2, 5));
		System.out.println(5 + " / " + 2 + " = " + obj.divide(5, 2));
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		return a - b;
	}

	@Override
	public long multiply(long a, long b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		if (b != 0)
			return a / b;
		return -1;
	}
}
