package copy;

import java.io.*;

public class More {
	
	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println(
				"usage: java More <filename>");
			System.exit(1);
		}
		try {
			Copier cp = new Copier(new FileInputStream(args[0]),
					System.out);
			cp.copy();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
