import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {
	
	private Image img_user = new ImageIcon(LoginPage.class.getResource("res/93d3e31639a4d07613de9dccdc8bd5e8.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image img_password = new ImageIcon(LoginPage.class.getResource("res/index.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image img_userName = new ImageIcon(LoginPage.class.getResource("res/images.jpg")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);

	private JPanel txtPassword;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		txtPassword = new JPanel();
		txtPassword.setForeground(new Color(22, 22, 26));
		txtPassword.setBackground(Color.DARK_GRAY);
		txtPassword.setBorder(new LineBorder(new Color(30, 144, 255), 2));
		setContentPane(txtPassword);
		txtPassword.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(30, 144, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(150, 167, 300, 44);
		txtPassword.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 13));
		txtUsername.setText("Username");
		txtUsername.setBounds(0, 0, 247, 44);
		String sUsername = txtUsername.getText();
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel usernameIcon = new JLabel("");
		usernameIcon.setHorizontalAlignment(SwingConstants.CENTER);
		usernameIcon.setBounds(247, 0, 53, 42);
		usernameIcon.setIcon(new ImageIcon(img_userName));
		panel.add(usernameIcon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(30, 144, 255)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(150, 218, 300, 38);
		txtPassword.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(0, -2, 245, 50);
		panel_1.add(pwdPassword);
		
		JLabel passwordIcon = new JLabel("");
		usernameIcon.setHorizontalAlignment(SwingConstants.CENTER);
		passwordIcon.setBounds(226, -2, 74, 40);
		passwordIcon.setIcon(new ImageIcon(img_password));
		panel_1.add(passwordIcon);
		
		JLabel iconLogo = new JLabel("");
		iconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		iconLogo.setBounds(150, 41, 300, 94);
		txtPassword.add(iconLogo);
		setUndecorated(true);
		iconLogo.setIcon(new ImageIcon(img_user));
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBackground(new Color(30, 144, 255));
		btnCreateAccount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CreateAccountPage newPage = new CreateAccountPage();
				newPage.setVisible(true);
			}
		});
		btnCreateAccount.setBounds(150, 343, 116, 23);
		txtPassword.add(btnCreateAccount);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				HomePage newPage = new HomePage();
				newPage.setVisible(true);
				dispose();
			}
		});
		btnLogin.setBounds(150, 266, 300, 57);
		txtPassword.add(btnLogin);
		setLocationRelativeTo(null);
	}
}
