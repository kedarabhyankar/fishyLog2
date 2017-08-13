package fishyClock2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fishyClockLogin extends JFrame {

	
	//declare all jframes accessible from here
	fishyClockRegister register = new fishyClockRegister();
	
	//declare all vars here
	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;
	public Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	public JTextField textField_1;
	public static Color darkerGrey = new Color(56,56,56);
	public static Color lightGrey = new Color(87,87,87);
	public static Color limeGreen = new Color(166,238,118);
	public static Color darkBlue = new Color(78,100,145);
	public static Color lightBlue = new Color(28,209,237);
	public static Color white = new Color(255,255,255);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fishyClockLogin frame = new fishyClockLogin();
					frame.setVisible(true);
					frame.setTitle("fishyLog");
					frame.setBackground(darkerGrey);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fishyClockLogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, dim.width, dim.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(darkerGrey);
		
		

		// FIRST NAME
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 29));
		textField.setBounds(896, 499, 156, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		// STUDENT ID
		textField_1 = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 29));
		textField_1.setBounds(895, 563, 157, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// LABELS/DESCRIPTORS FOR HOME SCREEN(look at var names for
		// identification of variables)

		JLabel txtpnFirstName = new JLabel();
		txtpnFirstName.setForeground(lightGrey);
		txtpnFirstName.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnFirstName.setBounds(731, 499, 156, 35);
		txtpnFirstName.setText("First Name");
		contentPane.add(txtpnFirstName);

		JLabel txtpnstudentID = new JLabel();
		txtpnstudentID.setForeground(lightGrey);
		txtpnstudentID.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnstudentID.setBounds(728, 563, 159, 35);
		txtpnstudentID.setText("Student ID ");
		contentPane.add(txtpnstudentID);
		
		//SUBHEADER ON WELCOME SCREEN
		Label sublabel = new Label("The premiere way to track your time in the robotics room.");
		sublabel.setForeground(white);
		sublabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		sublabel.setBounds(536, 201, 829, 118);
		contentPane.add(sublabel);

		
		//TITLE ON WELCOME SCREEN
		Label label = new Label("fishyLog");
		label.setForeground(lightGrey);
		label.setFont(new Font("Tahoma", Font.PLAIN, 99));
		label.setBounds(734, 0, 369, 281);
		contentPane.add(label);
		
		Button button = new Button("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					register.setVisible(true);
			}
		});
		button.setBounds(1011, 661, 79, 24);
		contentPane.add(button);

	}

}
