package com.github.csabe812.view;

import javax.swing.JFrame;

public class MainWindow {
	private JFrame window;
	
	//Initializing the main window
	public MainWindow() {
		//Name - visibility - size - add menubar - exitOnClose
		window = new JFrame(Labels.mainName);
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setJMenuBar(new MainWindowMenuBar(this));
		window.setVisible(true);
	}
	
	public JFrame getMainWindow() {
		return window;
	}
}
