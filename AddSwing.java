import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
public class AddSwing {
	public static void main(String[] args) {
		addition a=new addition();
	}
}
class addition extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b;
	JLabel l;
	public addition() 
	{
		t1=new JTextField(10);
		t2=new JTextField(10);
		b=new JButton("ADD");
		l=new JLabel("Result");
		//Adding objects
		add(t1);
		add(t2);
		add(b);
		add(l);
		b.addActionListener(this);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Reading input data from TextFields
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());		
		
		int value=n1+n2;
		//Setting data label
		l.setText(value +" ");
	}	
}