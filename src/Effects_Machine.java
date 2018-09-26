
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Effects_Machine implements ActionListener {
	JPanel Panel = new JPanel();
	JFrame Frame = new JFrame();
	JButton Button = new JButton("Muscle car sound");
	JButton Button2 = new JButton("marbles sound");
	JButton Button3 = new JButton("Cartoon Phone");

	public static void main(String[] args) {
		new Effects_Machine().visible();
	}

	public void actionPerformed(ActionEvent event) {
		event.getSource();

		if (event.getSource() == Button) {
			playSound("muscle.wav");
		}
		else if (event.getSource() == Button2) {
			playSound("marbles.wav");
		}
		else if (event.getSource() == Button3) {
			playSound("CartoonPhone.wav");
		}
	}

	public void visible() {
		Frame.add(Panel);
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel.add(Button);
		Panel.add(Button2);
		Panel.add(Button3);
		Button.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Frame.pack();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}