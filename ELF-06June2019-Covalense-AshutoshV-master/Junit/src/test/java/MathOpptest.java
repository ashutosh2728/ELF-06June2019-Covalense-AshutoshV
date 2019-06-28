import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.javaapp.operations.MathOpp;

public class MathOpptest {

	MathOpp m = new MathOpp();

	@Test
	public void addMethodTest() {
		assertEquals(25, m.add(15, 10));
	}

	@Test
	public void divMethodTest() {
		assertEquals(5, m.div(15, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void divMethodException() {
		m.div(10, 0);
	}
}
