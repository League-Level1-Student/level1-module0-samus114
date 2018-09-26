import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener  {
	JPanel Panel = new JPanel();
	JFrame Frame = new JFrame();
	JButton Button = new JButton("show duck");
	JButton Button2 = new JButton("show frog");
	JButton Button3 = new JButton("show fluffy unicorn");
	public static void main(String[] args) {
		new cutenessTV();
	}
	public cutenessTV() {
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
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		event.getSource();

		if (event.getSource() == Button) {
			showDucks();
		}
		else if (event.getSource() == Button2) {
			showFrog();
		}
		else if (event.getSource() == Button3) {
			showFluffyUnicorns();
		}
	}
}
