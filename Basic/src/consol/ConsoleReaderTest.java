package consol;

import java.io.*;

public class ConsoleReaderTest {
	public static void main(String args[]) {
		int      ivalue;
		double   dvalue;
		char     cvalue;
		String   svalue;
		
		try {
			ConsoleReader in = new ConsoleReader(System.in);
			System.out.print("������ �Է����ּ���:");
			ivalue = in.readInt();
			System.out.println("value = " + ivalue);
			System.out.print("\n�Ǽ��� �Է����ּ���:");
			dvalue = in.readDouble();
			System.out.println("value = " + dvalue);
			System.out.print("\n���ڸ� �Է����ּ���:");
			cvalue = in.readChar();
			System.out.println("value = " + cvalue);
			System.out.print("\n���ڿ��� �Է����ּ���:");
			svalue = in.readString();
			System.out.println("value = " + svalue);
		} catch (Exception e) {
			System.out.println("Ÿ�Կ� ���� ���� �Է��Դϴ�.");
		}
	}
}
