import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int totalScore = 0;
	
	public BowlingGame(){
		
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() > 10) {
			throw new BowlingException("Error. Maximum number of frames reached.");
		}
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame(firstThrow, secondThrow);
	}
	
	// Returns the game score
	public int score() {
		for (int i = 0; i < frames.size(); i++) {
			if (i != 0) {
				if(frames.get(i-1).isStrike()) {
					frames.get(i-1).setFrameScore(frames.get(i-1).getFrameScore() + frames.get(i).getFrameScore());
				} else if (frames.get(i-1).isSpare()) {
					frames.get(i-1).setFrameScore(frames.get(i-1).getFrameScore() + frames.get(i).getFirstThrow());
				}
				totalScore += frames.get(i).getFrameScore();
			}
		}
		if (bonus != null) {
			if (frames.get(9).isStrike()) {
				totalScore += bonus.getFrameScore();
			} else if (frames.get(9).isSpare()) {
				totalScore += bonus.getFirstThrow();
			}
		}
		return totalScore;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
}
