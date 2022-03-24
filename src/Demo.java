import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField email;
	private JPasswordField password;
    private JTextArea address;
    Connection con=JDBC.connect();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(56, 27, 102, 30);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(168, 27, 204, 30);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(56, 109, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(168, 111, 204, 30);
		contentPane.add(password);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(56, 68, 100, 30);
		contentPane.add(lblNewLabel_1_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(168, 70, 204, 30);
		contentPane.add(email);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(58, 163, 100, 30);
		contentPane.add(lblNewLabel_1_2);
		
		address = new JTextArea();
		address.setBounds(168, 168, 204, 77);
		contentPane.add(address);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=name.getText().toString();
				String em=email.getText().toString();
				String p=password.getPassword().toString();
				String a=address.getText().toString();
					try
					{
						String sql="insert into register(name,email,password,address) values('"+n+"','"+em+"','"+p+"','"+a+"')";
						Statement st=con.createStatement();
						int rs=st.executeUpdate(sql);
						if(rs==1)
						{
							JOptionPane.showMessageDialog(null, "Data Inserted");
						}else
						{
							JOptionPane.showMessageDialog(null, "Data Not Inserted");	
						}
					}catch (Exception e3) {
						// TODO: handle exception
					}
			}
		});
		btnNewButton.setBounds(170, 259, 202, 30);
		contentPane.add(btnNewButton);
		
	}
}
