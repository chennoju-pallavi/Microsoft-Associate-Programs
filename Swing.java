import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Swing {
	public static void main(String[] args) {
		ABC a=new ABC();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class ABC extends JFrame
{
	public ABC() {
		setLayout(new FlowLayout());
		JLabel label=new JLabel("Hiii");
		add(label);
		JLabel label1=new JLabel("Students");
		add(label1);
		setVisible(true);
		setSize(400,400);
	}
}