package telran.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class StringsTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
	void SortStringsasDatestest() {
		String[] dates = {
			"12/10/1998","19/09/1984","17/09/1984","29/06/1989"	
		};
		String[] expected = {
				"17/09/1984", "19/09/1984", "29/06/1989","12/10/1998"
		};
		assertArrayEquals(expected, Strings.sortStringsasDates(dates));
 	}

}
