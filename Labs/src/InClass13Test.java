import static org.junit.Assert.*;

import org.junit.Test;

public class InClass13Test {

	@Test
	public void powerTest() {
		InClass13 activity = null;
		double sampleBase = 2.0;
		int sampleExp = 1;
		assertEquals(2.0,activity.power(sampleBase, sampleExp));
		
	}

}
