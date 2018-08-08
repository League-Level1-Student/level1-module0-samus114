import java.awt.event.MouseEvent;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
	 static Random rand=new Random();
	 
	public static void main(String[] args) {
	Robot.setWindowColor(0,0,0);
	rob.setSpeed(500);
	rob.moveTo(1, 550);
	rob.turn(90);
	rob.move(10);
	for (int i = 0; i < 9; i++) {
		int x = rand.nextInt(3);
		//houseDrawer();
	if (x==0) {
		houseDrawer("small");
	}else if (x==1) {
		houseDrawer("medium");
	} else {
		houseDrawer("large");
	}
	}
}
static void houseDrawer(String size) {
	int height = 0;
	rob.setRandomPenColor();
	rob.penDown();
	boolean pointy = false;
	if (size.equalsIgnoreCase("small")) {
		height = 60;
		pointy = true;
	}else if (size.equalsIgnoreCase("medium")) {
		height = 120;
		pointy = true;
	}else if (size.equalsIgnoreCase("large")) {
		height = 250;
	}
		rob.turn(-90);
		rob.move(height);
		if (pointy) {
			drawPointyRoof();
		}else {
			drawFlatRoof();
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0,255,0);
		rob.move(60);


}
public static void drawPointyRoof() {
	rob.turn(45);
	rob.move(20);
	rob.turn(90);
	rob.move(20);
	rob.turn(45);
}
public static void drawFlatRoof() {
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
}
}