package com.will.gui;

import java.awt.*;
import javax.swing.*;

public class SwingLayout_2 {
	JFrame f;

	SwingLayout_2() {
		f = new JFrame();

		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");

		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);

		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingLayout_2();
	}
}
