//manu was hereeee
/// hereeeeeee
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	private static final String ROBOT_PNG = "robot.png";
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(ROBOT_PNG, 200, 200);
		add(robot);
		GLabel label = new GLabel("Did you guys know that in Cars 2 there's a higher kill count than any of the Saw movies google it it's true. This is why Cars 2 should be PG-13 and- (1/80)", 200, 400);
		add(label);
		//yoyoyoyoyoyoyoyoyoyoyoyoyo
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}