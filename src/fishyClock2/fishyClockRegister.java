package fishyClock2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fishyClockRegister extends JFrame {

	// other jframe declarations

	// vars

	public JTextField fnField;
	public JPasswordField passwordField;
	public JTextField idField;
	public JTextField lnField;
	public JLabel txtpnError;
	public static Color darkerGrey = new Color(56, 56, 56);
	public static Color lightGrey = new Color(87, 87, 87);
	public static Color limeGreen = new Color(166, 238, 118);
	public static Color darkBlue = new Color(78, 100, 145);
	public static Color lightBlue = new Color(28, 209, 237);
	public static Color white = new Color(255, 255, 255);
	public static Color alertRed = new Color(255, 0, 0);
	public Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fishyClockRegister frame = new fishyClockRegister();
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
	public fishyClockRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, dim.width, dim.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(darkerGrey);
		contentPane.setLayout(null);

		// HEAD LABEL
		JLabel lblTitle = new JLabel("Register for an account for fishyLog");
		lblTitle.setForeground(lightGrey);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 78));
		lblTitle.setBounds(319, 0, 1264, 258);
		contentPane.add(lblTitle);

		// SUBHEAD LABEL
		JLabel lblsubHead = new JLabel(
				"<html><center>In order to track your time in the room, you will have to make an account. <br>Fill out the credentials below in order to track your room time.</center></html>");
		lblsubHead.setBounds(421, 199, 1059, 106);
		lblsubHead.setForeground(white);
		lblsubHead.setFont(new Font("Tahoma", Font.PLAIN, 32));
		contentPane.add(lblsubHead);

		// FIRST NAME LABEL
		JLabel txtpnFirstName = new JLabel();
		txtpnFirstName.setForeground(lightGrey);
		txtpnFirstName.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnFirstName.setBounds(728, 499, 156, 35);
		txtpnFirstName.setText("First Name");
		contentPane.add(txtpnFirstName);

		// STUDENT ID LABEL
		JLabel txtpnstudentID = new JLabel();
		txtpnstudentID.setForeground(lightGrey);
		txtpnstudentID.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnstudentID.setBounds(728, 627, 156, 35);
		txtpnstudentID.setText("Student ID ");
		contentPane.add(txtpnstudentID);

		// LAST NAME LABEL
		JLabel txtpnLastName = new JLabel();
		txtpnLastName.setForeground(lightGrey);
		txtpnLastName.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnLastName.setBounds(728, 563, 156, 35);
		txtpnLastName.setText("Last Name");
		contentPane.add(txtpnLastName);

		// FIRST NAME FIELD
		fnField = new JTextField();
		fnField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		fnField.setBounds(896, 499, 156, 35);
		contentPane.add(fnField);
		fnField.setColumns(10);

		// STUDENT ID FIELD
		idField = new JTextField();
		idField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		idField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		idField.setBounds(896, 627, 156, 35);
		contentPane.add(idField);
		idField.setColumns(10);

		// LAST NAME FIELD
		lnField = new JTextField();
		lnField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lnField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lnField.setBounds(896, 563, 156, 35);
		contentPane.add(lnField);
		lnField.setColumns(10);

		// error label
		txtpnError = new JLabel();
		txtpnError.setForeground(alertRed);
		txtpnError.setFont(new Font("Tahoma", Font.PLAIN, 29));
		txtpnError.setBounds(500, 349, 901, 95);
		txtpnError.setText(
				"<html><center>One or more of the fields below are empty or incomplete. <br>Please check to make sure all fields are filled correctly.</center></html>");

		// submit registration
		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkIfDataFieldsAreEmpty();
			}
		});
		button.setBounds(1030, 730, 79, 24);
		contentPane.add(button);

	}

	public void checkIfDataFieldsAreEmpty() {

		if (fnField.getText().trim().isEmpty() || idField.getText().trim().isEmpty()
				|| lnField.getText().trim().isEmpty()) {

			contentPane.add(txtpnError);
			return;
		}

		System.out.println("success adding new user");
		System.out.println("successfully passed data to passToCSV.");
		fishyRegistrationToCSV toCSV = new fishyRegistrationToCSV(idField.getText().trim(),
				lnField.getText().trim(), fnField.getText().trim());
		toCSV.passToCSV();

	}
}
