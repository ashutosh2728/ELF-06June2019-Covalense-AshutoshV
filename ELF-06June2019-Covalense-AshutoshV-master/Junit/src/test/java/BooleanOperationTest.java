import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.javaapp.operations.BooleanOperation;

public class BooleanOperationTest {

	private BooleanOperation bo = new BooleanOperation();

	@Test
	public void testBooleanOperation() {
		boolean expected = true;
		boolean actual = bo.booleanOpp(12);
		assertEquals(expected, actual);
	}
}
