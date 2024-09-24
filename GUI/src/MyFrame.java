import javax.swing.*;

public class MyFrame extends JFrame{
	
	private JPanel panel;
	private JTextField textField;
	private JButton button;

	public MyFrame()  {
		//1
		panel = new JPanel();
		//2
		textField = new JTextField(10);
		button = new JButton("Press me!");
		
		//3
		panel.add(textField);
		panel.add(button);
		
		//4
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("My fisrst Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
