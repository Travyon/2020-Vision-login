package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

		JFrame frame = new JFrame();
		JButton loginButton = new JButton("Login");
		JButton signUpButton = new JButton("Sign Up");
		JTextField userIDField = new JTextField();
		JPasswordField userPasswordField = new JPasswordField();
		JLabel userIDLabel = new JLabel("userID");
		JLabel userPassword = new JLabel("password:");
		JLabel messageLabel = new JLabel("");
		HashMap<String,String> logininfo = new HashMap<String,String>();


LoginPage(HashMap<String, String> loginInfoOriginal){
		
	
	logininfo = loginInfoOriginal;
		userIDLabel.setBounds(50,100,75,25);
		userPassword.setBounds(50,150,75,25);
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		signUpButton.setBounds(225, 200, 100, 25);
		signUpButton.addActionListener(this);
		messageLabel.setBounds(125, 250, 250, 250);
		messageLabel.setFont(new Font(null, Font.ITALIC,25));
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		
		frame.add(userIDLabel);
		frame.add(userPassword);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(signUpButton);
		frame.add(loginButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true); //MAkes it visible to user
}


//actionPerformed method will handle events
@Override
public void actionPerformed(ActionEvent e) {
		if(e.getSource()== signUpButton) {
		userIDField.setText("");
		userPasswordField.setText("");
		}
		
		if(e.getSource()== loginButton) {
		String userID = userIDField.getText();
		String password = String.valueOf(userPasswordField.getPassword());
			
		if(logininfo.containsKey(userID)) {
		 if(logininfo.get(userID).equals(password)) {
				messageLabel.setForeground(Color.green);
				messageLabel.setText("Login successful");
				frame.dispose();
				WelcomePage welcomePage = new WelcomePage(userID); 
			}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}
		}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("username not found");
				}
	}
  }
}
