package fibonachi;

public class Main {

	public static void main(String[] args) {

		Fibonachi f = new Fibonachi();
		int n = 10;
		int result[] = f.calculate(n);
		for (int index = 0; index < n; index++) {

			System.out.print(result[index] + " ");

		}

	}

}
