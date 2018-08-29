import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
public static void main(String[] args) {
	fortuneCookie fc = new fortuneCookie();
	fc.showButton();
}
public void showButton() {
    System.out.println("Button clicked");
    JFrame frame = new JFrame();
    JButton button = new JButton("Fortune cookie");
    frame.add(button);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button.addActionListener(this);
    frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	int rand = new Random().nextInt(5);
if (rand==0) {
	JOptionPane.showMessageDialog(null, "If winter comes, can spring be far behind?");
}else if (rand==1) {
	JOptionPane.showMessageDialog(null, "Love can last a lifetime, if you want it to.");
} else if(rand==2) {
	JOptionPane.showMessageDialog(null, "Your shoes will make you happy today.");
}else if (rand==3) {
	JOptionPane.showMessageDialog(null, "You will be called in to fulfill a position of high honor and responsibility.");
} else {
JOptionPane.showMessageDialog(null, "You already know the answer to the questions lingering inside your head.");
}
}
}