package insertedSorting;

public class Main {

	static void insertionSort(int[] arr) {

		for (int index = 1; index < arr.length; index++) {

			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Q = { 8, 2, 4, 9, 3, 6 };

		for (int i = 0; i < Q.length; i++) {
			System.out.print(Q[i] + " ");
		}

		System.out.println("");
		insertionSort(Q);

		for (int i = 0; i < Q.length; i++) {
			System.out.print(Q[i] + " ");
		}

	}

}
