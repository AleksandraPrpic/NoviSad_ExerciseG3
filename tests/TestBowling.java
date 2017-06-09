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
		fr.score();
	}
	
	@Test
	public void testIfFrameIsStrike() {
		fr = new Frame(10,0);
		assertTrue(fr.isStrike());
	}
	
	@Test
	public void testIfFrameIsNotStrike() {
		fr = new Frame(4,0);
		assertFalse(fr.isStrike());
	}
	
	@Test
	public void testIfFrameIsSpare() {
		fr = new Frame(2,8);
		assertTrue(fr.isSpare());
	}
	
	@Test
	public void testIfFrameIsNotSpare() {
		fr = new Frame(2,3);
		assertFalse(fr.isSpare());
	}
	
	@Test
	public void testIsFrameIsProperlyAdded() {
		bg.addFrame(new Frame(2,3));
		
	}

}
