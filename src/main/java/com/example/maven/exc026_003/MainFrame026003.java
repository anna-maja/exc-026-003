package com.example.maven.exc026_003;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame026003 {

	//constructors
	private JFrame frmConversor = new JFrame(); 
	
	private JTextField tfValueRadians = new JTextField();
	private JTextField tfValueDegrees = new JTextField();
	
	private JButton btnToRadians = new JButton("To Radians");
	private JButton btnToDegrees = new JButton("To Degrees");
	
	private JLabel lblEnterTheValue = new JLabel("Enter the value in Radians:");
	private JLabel lblEnterTheValue_1 = new JLabel("Enter the value in Degrees:");
	private JLabel lblResult = new JLabel("RESULT");
	
	ConversorDegreesRadians cdr = new ConversorDegreesRadians(); 
	/**
	 * Create the application.
	 */
	public MainFrame026003() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor.setTitle("Conversor");
		frmConversor.setBounds(100, 100, 450, 300);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnToRadians.setBounds(56, 183, 117, 25);
		btnToDegrees.setBounds(284, 183, 117, 25);

		lblEnterTheValue.setBounds(88, 12, 313, 15);
		lblEnterTheValue_1.setBounds(88, 89, 313, 15);
		lblResult.setBounds(59, 156, 241, 15);
		
		tfValueRadians.setBounds(88, 37, 202, 40);
		tfValueRadians.setColumns(10);
		tfValueDegrees.setBounds(88, 104, 202, 40);
		tfValueDegrees.setColumns(10);
		
		frmConversor.getContentPane().setLayout(null);
		frmConversor.getContentPane().add(btnToRadians);
		frmConversor.getContentPane().add(btnToDegrees);
		frmConversor.getContentPane().add(lblEnterTheValue);
		
		frmConversor.getContentPane().add(lblEnterTheValue_1);
		frmConversor.getContentPane().add(lblResult);
		
		frmConversor.getContentPane().add(tfValueRadians);
		frmConversor.getContentPane().add(tfValueDegrees);
		
	

		btnToRadians.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double valueInRadians = Double.parseDouble(tfValueDegrees.getText().toString());
				double result = cdr.convertDegreesToRadians(valueInRadians);
				lblResult.setText("Result: " + result);
				tfValueDegrees.setText("");
				tfValueRadians.setText("");
				
			}
		});
		

		btnToDegrees.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double valueInDegrees = Double.parseDouble(tfValueRadians.getText().toString());
				double result = cdr.convertRadiansToDegrees(valueInDegrees);
				lblResult.setText("Result: " + result);
				tfValueDegrees.setText("");
				tfValueRadians.setText("");
			
			}
		});
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame026003 window = new MainFrame026003();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
