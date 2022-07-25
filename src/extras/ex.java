package extras;

import java.util.Arrays;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {2,3,5,7,12,34,9};
System.out.println((check(array)));
//System.out.println(Arrays.toString(array));

	}
public static String check(int[] array) {
	int[] ar = new int[50];
	for(int i = 0; i < array.length; i++) {
		ar[array[i]] = array[i];
	}
	return Arrays.toString(ar);
}
}
