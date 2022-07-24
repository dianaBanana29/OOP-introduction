package telran.text;

import java.util.Comparator;

public class DatesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		String[] date1 = o1.split("/");
		String[] date2 = o2.split("/");
		int res =Integer.compare(Integer.parseInt(date1[2]), Integer.parseInt(date2[2]));
		if(res == 0) {
			res = Integer.compare(Integer.parseInt(date1[1]), Integer.parseInt(date2[1]));
			if(res==0) {
				res = Integer.compare(Integer.parseInt(date1[0]), Integer.parseInt(date2[0]));
			}
		}
		
		return res;
	}

}
