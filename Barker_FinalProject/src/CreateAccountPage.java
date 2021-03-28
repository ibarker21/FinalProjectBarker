import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateAccountPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailAddress;
	private JTextField txtUsername;
	private JTextField txtDisplayName;
	private JTextField txtPassword;
	private JTextField txtConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccountPage frame = new CreateAccountPage();
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
	public CreateAccountPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 447);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(30, 144, 255), 2));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREATE ACCOUNT");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(149, 59, 300, 55);
		contentPane.add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(149, 125, 144, 31);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(301, 125, 148, 31);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setText("Email Address");
		txtEmailAddress.setBounds(149, 167, 300, 31);
		contentPane.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(149, 209, 144, 31);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtDisplayName = new JTextField();
		txtDisplayName.setText("Display Name");
		txtDisplayName.setBounds(301, 209, 148, 31);
		contentPane.add(txtDisplayName);
		txtDisplayName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(149, 251, 300, 31);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setText("Confirm Password");
		txtConfirmPassword.setBounds(149, 293, 300, 31);
		contentPane.add(txtConfirmPassword);
		txtConfirmPassword.setColumns(10);
		
		JLabel lblPasswordNoMatch = new JLabel("Passwords Don't Match");
		lblPasswordNoMatch.setForeground(Color.DARK_GRAY);
		lblPasswordNoMatch.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPasswordNoMatch.setBounds(149, 338, 144, 20);
		contentPane.add(lblPasswordNoMatch);
		
		JButton btnConfirm = new JButton("Save and Close");
		btnConfirm.setFont(new Font("Arial", Font.PLAIN, 9));
		btnConfirm.setBounds(339, 335, 110, 23);
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String sFirstName = txtFirstName.getText();
				String sLastName = txtLastName.getText();
				String sEmail = txtEmailAddress.getText();
				String sUsername = txtUsername.getText();
				String sDisplayName = txtDisplayName.getText();
				String sPassword = "";
				if(txtPassword.getText().equals(txtConfirmPassword.getText()))
				{
					sPassword = txtPassword.getText();
					Hasher hasher = new Hasher();
					sPassword = hasher.hasher(sPassword);
					System.out.println(sPassword);
					try
					{
			            BufferedWriter bw = new BufferedWriter(new FileWriter("tester.txt"));
			            bw.write(sUsername +" | " + sPassword);
			            bw.close();
			        }catch(Exception ex){
			            ex.printStackTrace();
			        }
					dispose();
				}
				else
				{
					lblPasswordNoMatch.setForeground(Color.RED);
				}
				
			}
		});
		contentPane.add(btnConfirm);
		
		
	}
}
