package telran.text;

import java.util.Arrays;

public class Strings {
public static String[] sortStringsasDates(String [] dates) {
	String[] res = Arrays.copyOf(dates, dates.length);
	Arrays.sort(res, new DatesComparator());
	return res;
}
}
