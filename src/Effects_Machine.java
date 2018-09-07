
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Effects_Machine implements ActionListener {
	JFrame sam = new JFrame();
	JButton Button = new JButton();

	public static void main(String[] args) {
		new Effects_Machine().visible();
	}

	public void actionPerformed(ActionEvent event ) {
		event.getSource();
		
		if (event.getSource()==Button) {
			playSound("muscle.wav");
		}
	}

	public void visible() {
		sam.setVisible(true);
		sam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}