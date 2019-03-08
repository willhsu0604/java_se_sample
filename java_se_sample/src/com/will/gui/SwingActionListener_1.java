package com.will.gui;

import javax.swing.*;
import java.awt.event.*;

public class SwingActionListener_1 extends JFrame {
	
	SwingActionListener_1() {
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b = new JButton("Click Here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");
			}
		});
		this.setName("Button Example");
		add(b);
		add(tf);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingActionListener_1();
	}
}
