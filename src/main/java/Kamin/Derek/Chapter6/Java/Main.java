package Kamin.Derek.Chapter6.Java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumerator = new JLabel("Numerator");
		lblNumerator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumerator.setBounds(66, 37, 130, 19);
		frame.getContentPane().add(lblNumerator);
		
		JLabel lblDenominator = new JLabel("Denominator");
		lblDenominator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDenominator.setBounds(66, 78, 130, 19);
		frame.getContentPane().add(lblDenominator);
		
		JLabel lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResult.setBounds(161, 135, 130, 19);
		frame.getContentPane().add(lblResult);
		
		JButton btnCalculate = new JButton("Calculate");
		
		btnCalculate.setBounds(66, 133, 85, 21);
		frame.getContentPane().add(btnCalculate);
		
		textField = new JTextField();
		textField.setBounds(155, 39, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 80, 96, 19);
		frame.getContentPane().add(textField_1);
		
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double n = Double.parseDouble(textField.getText());
				double d = Double.parseDouble(textField_1.getText());
				
				SimpleMath math = new SimpleMath();
				
				
				
				try {
					double result = math.divide(n, d);
					lblResult.setText(result + "");
				} catch (ArithmeticException error){
					lblResult.setText("Cannot divide by 0");
				}
				
				
			}
		});
	}
}
