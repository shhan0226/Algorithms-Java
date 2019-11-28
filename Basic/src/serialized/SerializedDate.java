package serialized;

import java.util.*;
import java.io.*;

public class SerializedDate {
	Date date;
	ObjectOutputStream os;
	ObjectInputStream is;

	public SerializedDate() {
		date = new Date();
		os = null;
		is = null;
	}

	public void write(String file) {
		try {
			FileOutputStream fout = new FileOutputStream(file);
			os = new ObjectOutputStream(fout);
			System.out.println("We save this date.. :" + date);
			os.writeObject(date);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void read(String file) {
		try {
			FileInputStream fin = new FileInputStream(file);
			is = new ObjectInputStream(fin);
			date = (Date) is.readObject();
			System.out.println("We gets saved old date.. :" + date);
			System.out.println("Current date is .. :" + new Date());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException nfe) {
			nfe.printStackTrace();
		}
	}

	public static void main(String args[]) {
		SerializedDate sd = new SerializedDate();
		sd.write("./data/date.ser");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		sd.read("./data/date.ser");
	}
}
