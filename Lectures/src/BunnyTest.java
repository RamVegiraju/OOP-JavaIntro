import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BunnyTest {
	
	Bunny bunny;
	
	@Before
	public void setup() {
		bunny = new Bunny();
	}

	@Test
	public void hopTest() {
		Bunny bunny = new Bunny();
		assertEquals("Bunny failed to hop", "Hop", bunny.hop());
	}
	
	@Test
	public void munchTest() {
		assertEquals("Bunny failed to munch", "Chomp", bunny.munch());
	}

}
