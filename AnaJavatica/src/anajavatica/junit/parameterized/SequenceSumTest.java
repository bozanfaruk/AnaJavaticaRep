package anajavatica.junit.parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@SuppressWarnings("javadoc")
public class SequenceSumTest {

	private static SequenceSum sequence = null;
	private int begValue = 0;
	private int endValue = 0;
	private int expected = 0;

	public SequenceSumTest(int begValue, int endValue, int expected) {
		this.begValue = begValue;
		this.endValue = endValue;
		this.expected = expected;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sequence = new SequenceSum();
	}

	@Parameters
	public static Collection<Integer[]> createParameterSet() {
		List<Integer[]> parameterSet = new ArrayList<>();
		parameterSet.add(new Integer[] { 1, 3, 6 });
		parameterSet.add(new Integer[] { 0, 2, 3 });
		parameterSet.add(new Integer[] { 1, 10, 55 });
		return parameterSet;
	}

	@Test
	public void testSum() {
		int result = sequence.sum(begValue, endValue);
		Assert.assertTrue(expected == result);
	}

}
