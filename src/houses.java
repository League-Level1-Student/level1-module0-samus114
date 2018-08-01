import java.awt.event.MouseEvent;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
	 static Random rand=new Random();
	 
	public static void main(String[] args) {
	rob.setSpeed(500);
	rob.moveTo(1, 550);
	rob.turn(90);
	rob.move(10);
	for (int i = 0; i < 9; i++) {
		int x = rand.nextInt(3);
		//houseDrawer();
	}
}
static void houseDrawer(String size ) {
	int height = 0;
	if (size.equalsIgnoreCase("small")) {
		height = 60;
	}else if (size.equalsIgnoreCase("medium")) {
		height = 120;
	}else if (size.equalsIgnoreCase("large")) {
		height = 250;
	}
	rob.setPenColor(0,0,0);
	rob.turn(-90);
	rob.penDown();
	rob.move(height);
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.setPenColor(0,255,0);
	rob.move(60);
}
}