package instanceof_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal A = new Animal();
		Dog B = new Dog();

		if (A instanceof Dog) {
			System.out.println("�θ� �ڽ����� ����ȯ");
		}
		
		if (B instanceof Animal) {
			System.out.println("�ڽ��� �θ�� ����ȯ");
		}

	}

}