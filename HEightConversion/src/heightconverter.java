import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class heightconverter {

	private JFrame frmFeetAndInches;
	private JTextField FeetTextField;
	private JTextField CentimetersTextField;
	private JTextField InchesTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heightconverter window = new heightconverter();
					window.frmFeetAndInches.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public heightconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFeetAndInches = new JFrame();
		frmFeetAndInches.setTitle("Feet And Inches Conversion To Centimeters");
		frmFeetAndInches.getContentPane().setBackground(Color.CYAN);
		frmFeetAndInches.setBounds(100, 100, 450, 300);
		frmFeetAndInches.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFeetAndInches.getContentPane().setLayout(null);
		
		JLabel FeetLabel = new JLabel("Feet:");
		FeetLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		FeetLabel.setBounds(113, 10, 100, 42);
		frmFeetAndInches.getContentPane().add(FeetLabel);
		
		FeetTextField = new JTextField();
		FeetTextField.setBounds(227, 19, 144, 33);
		frmFeetAndInches.getContentPane().add(FeetTextField);
		FeetTextField.setColumns(10);
		
		JLabel InchesLabel = new JLabel("Inches:");
		InchesLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		InchesLabel.setBounds(113, 62, 90, 31);
		frmFeetAndInches.getContentPane().add(InchesLabel);
		
		JButton ConvertBTN = new JButton("CONVERT  TO");
		ConvertBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet,inches,centimeters;
				feet=Double.parseDouble(FeetTextField.getText());
				inches=Double.parseDouble(InchesTextField.getText());
				centimeters=(feet*12+inches)*2.54;
				CentimetersTextField.setText(String.valueOf(centimeters));
			}
		});
		ConvertBTN.setForeground(Color.WHITE);
		ConvertBTN.setBackground(Color.BLUE);
		ConvertBTN.setFont(new Font("Verdana", Font.BOLD, 20));
		ConvertBTN.setBounds(41, 103, 358, 42);
		frmFeetAndInches.getContentPane().add(ConvertBTN);
		
		CentimetersTextField = new JTextField();
		CentimetersTextField.setBounds(227, 163, 144, 33);
		frmFeetAndInches.getContentPane().add(CentimetersTextField);
		CentimetersTextField.setColumns(10);
		
		JButton ClearBTN = new JButton("Clear");
		ClearBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeetTextField.setText("");
				InchesTextField.setText("");
				CentimetersTextField.setText("");
			}
		});
		ClearBTN.setForeground(Color.WHITE);
		ClearBTN.setBackground(Color.MAGENTA);
		ClearBTN.setFont(new Font("Verdana", Font.BOLD, 20));
		ClearBTN.setBounds(74, 218, 100, 33);
		frmFeetAndInches.getContentPane().add(ClearBTN);
		
		JButton ExitBTN = new JButton("Exit");
		ExitBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBTN.setForeground(Color.WHITE);
		ExitBTN.setBackground(Color.RED);
		ExitBTN.setFont(new Font("Verdana", Font.BOLD, 20));
		ExitBTN.setBounds(263, 218, 100, 33);
		frmFeetAndInches.getContentPane().add(ExitBTN);
		
		InchesTextField = new JTextField();
		InchesTextField.setBounds(227, 63, 144, 33);
		frmFeetAndInches.getContentPane().add(InchesTextField);
		InchesTextField.setColumns(10);
		
		JLabel CentimetersLabel = new JLabel("Centimeters:");
		CentimetersLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		CentimetersLabel.setBounds(49, 160, 176, 31);
		frmFeetAndInches.getContentPane().add(CentimetersLabel);
	}

}
