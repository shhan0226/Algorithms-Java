package calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class calendarDate {

	public static void main(String[] args) {
		SimpleDateFormat nt = new SimpleDateFormat("yyyy-MM-dd");
		String nowTime = nt.format(new Date());
		System.out.println(nowTime);

		ArrayList<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		Iterator<Integer> it = List.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			if (n.equals(1)) {
				List.remove(n);
				break;
			}
		}

		System.out.println();
		it = List.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
		}

	}

}
