import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(30, 144, 255), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(-18, 11, 831, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(720, 70, 89, 23);
		panel.add(btnLogout);
		
		JButton btnCeasarCypher = new JButton("Ceasar Cypher");
		btnCeasarCypher.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCeasarCypher.setBounds(157, 126, 150, 150);
		contentPane.add(btnCeasarCypher);
		
		JButton btnHasher = new JButton("Hasher");
		btnHasher.setFont(new Font("Arial", Font.PLAIN, 16));
		btnHasher.setBounds(317, 126, 150, 150);
		contentPane.add(btnHasher);
		
		JButton btnEncryptor = new JButton("Encryptor");
		btnEncryptor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEncryptor.setBounds(477, 126, 150, 150);
		contentPane.add(btnEncryptor);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(157, 287, 150, 150);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(317, 287, 150, 150);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(477, 287, 150, 150);
		contentPane.add(btnNewButton_5);
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				LoginPage newPage = new LoginPage();
				newPage.setVisible(true);
				dispose();
			}
		});
		setUndecorated(true);
	}
}
