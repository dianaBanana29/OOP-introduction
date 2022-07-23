package extras;

import java.util.Arrays;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12/2/1980";
		 int[] res = splitter(str);
		 System.out.println(Arrays.toString(res));
		 String s = "" + res[0] + "/" + res[1] + "/" + res[2];
		 System.out.println(s);
		 

	}
	
public static int[] splitter(String str) {
return Arrays.stream(str.split("/")).mapToInt(Integer::parseInt).toArray();
}
}
