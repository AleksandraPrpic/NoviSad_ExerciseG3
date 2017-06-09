import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame fr;
	BowlingGame bg;
	
	@Test
	public void testIfFrameIsProperlyInitialized() {
		fr = new Frame(2,3);
		assertEquals(5, fr.score());
	}

}
