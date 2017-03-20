package com.github.csabe812.dartsy.view;

import javax.swing.JFrame;

import com.github.csabe812.dartsy.controller.DartsyController;

public class MainWindow {
	private DartsyController controller;
	
	private JFrame window;
	
	//Initializing the main window
	public MainWindow(DartsyController dc) {
		this.controller = dc;
		
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
	
	public DartsyController getController() {
		return controller;
	}
}
