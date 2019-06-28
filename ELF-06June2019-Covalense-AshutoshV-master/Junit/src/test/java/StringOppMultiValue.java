import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.covalense.javaapp.operations.StringOperation;

@RunWith(Parameterized.class)
public class StringOppMultiValue {

	private String name;
	private int value;

	private StringOperation str = new StringOperation();

	public StringOppMultiValue(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "apple", 5 }, { "Raju", 4 }, { "Rajaram", 7 } };
		return Arrays.asList(obj);
	}

	@Test
	public void testcountCharInString() {
		int res = str.countCharInString(name);
		assertEquals(value, res);
	}

}
