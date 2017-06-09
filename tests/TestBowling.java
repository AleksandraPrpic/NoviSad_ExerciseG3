import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame fr;
	BowlingGame bg;
	
	@Test
	public void testIfScoreForOneFrameIsLessThan10() throws BowlingException{
		fr = new Frame(2,3);
		assertEquals(5, fr.score());
	}
	
	@Test(expected=BowlingException.class)
	public void testIfScoreForOneFrameIsMoreThan10() throws BowlingException {
		fr = new Frame(2,14);
	}

}
