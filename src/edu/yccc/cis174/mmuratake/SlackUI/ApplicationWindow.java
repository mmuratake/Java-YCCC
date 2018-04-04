package edu.yccc.cis174.mmuratake.SlackUI;

import java.awt.EventQueue;

// In order to install software (this Application Window thing), go to Slack, follow url, copy the url, get over here, click "Help", 
// "Install New Software", paste, then take it away from there. Yeah!

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ApplicationWindow {

	private JFrame frame;
	private JTextField txtJavaIsGreat;
	private SlackService ss = new SlackService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ApplicationWindow window = new ApplicationWindow();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ss.submitTextToSlack(txtJavaIsGreat.getText());
			}
		});
		btnSubmit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		txtJavaIsGreat = new JTextField();
		txtJavaIsGreat.setText("Java is great!");
		txtJavaIsGreat.setBounds(10, 29, 86, 20);
		frame.getContentPane().add(txtJavaIsGreat);
		txtJavaIsGreat.setColumns(10);
		
	}
}
