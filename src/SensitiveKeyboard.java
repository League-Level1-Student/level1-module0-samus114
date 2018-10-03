import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
public class SensitiveKeyboard implements KeyListener{
JFrame frame = new JFrame();
String words = "ouch";
	public static void main(String[] args) {
	new SensitiveKeyboard().visible();
}
	public void visible() {
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
System.out.println(words);
	speak(words);
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub	
}
}