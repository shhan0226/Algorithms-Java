package dataModify;

import java.util.regex.*;

public class DataSpliter {
	protected Pattern pat;
	
	public DataSpliter(String reg) {
		pat = Pattern.compile(reg);
	}
	
	public String[] getValue(String data) {
		return pat.split(data);
	}
	
	public static void main(String args[]) {
		String data = "ȫ�浿, 123-4567, hong@some.com";
		DataSpliter ds = new DataSpliter("[,\\s]+");
		String value[] = ds.getValue(data);
		for(int i=0; i < value.length; i++) {
			System.out.println(value[i]);
		}
	}	
}