//osbaldo was hereeee
///yoyoma 
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	private static final String robots_png = "robot.png";
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(robots_png, 200, 200);
		add(robot);
		GLabel label = new GLabel("According to all known laws of aviation, there is no way a bee should be able to fly.\r\n"
				+ "Its wings are too small to get its fat little body off the ground.\r\n"
				+ "The bee, of course, flies anyway because bees don't care what humans think is impossible.\r\n"
				+ "Yellow, black. Yellow, black. Yellow, black. Yellow, black.\r\n"
				+ "Ooh, black and yellow!\r\n"
				+ "Let's shake it up a little.\r\n"
				+ "Barry! Breakfast is ready!", 200, 400);
		add(label);
	}
	// osbaldo was here
	}

	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}