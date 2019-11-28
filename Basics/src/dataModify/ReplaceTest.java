package dataModify;

import java.util.regex.*;

public class ReplaceTest {
	
	public static void main(String args[]) {
		String data = "ȫ�浿, 123-4567, hong@some.com";
		Pattern pat = Pattern.compile("[,\\s]+");
		Matcher m = pat.matcher(data);
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();
		while(result == true) {
			m.appendReplacement(sb, ":");
			result = m.find();
		}
		m.appendTail(sb);
		System.out.println(data + "  =>");
		System.out.println(sb.toString());
	}

}
