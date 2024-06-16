package entities;

public class A {
	public int num;

	public A(int num) {
		this.num = num;
	}

	public int getFactorial() {
		if (this.num <= 0)
			return 0;
		int factorial = 1;
		for (int i = 1; i <= this.num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	@Override
	public String toString() {
		StringBuilder numbers = new StringBuilder();
		for (int i = 1; i <= this.num; i++) {
			numbers.append(i);
			numbers.append(" ");
		}
		return "Numbers: " + numbers + "-> Result: " + getFactorial();
	}
}
