import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.javaapp.operations.StringOperation;

public class StringOperationTest {

	private StringOperation strOpp = new StringOperation();

	@Test
	public void testCharToString() {
		int expected = 5;
		int actual = strOpp.countCharInString("Ramya");
		assertEquals(expected, actual);
	}

	@Test(expected = NullPointerException.class)
	public void testCharToStringException() {
		int actual = strOpp.countCharInString(null);
	}

}
