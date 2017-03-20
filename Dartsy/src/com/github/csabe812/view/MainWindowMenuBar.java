package com.github.csabe812.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.github.csabe812.view.dialog.AboutUsDialog;

public class MainWindowMenuBar extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = -646198264487290723L;
	private MainWindow mw;
	
	public MainWindowMenuBar(MainWindow mw) {
		super();
		this.mw = mw;
		createMenuPoint(Labels.newNew, Labels.newGame, Labels.addNewPlayer);
		createMenuPoint(Labels.help, Labels.aboutUs);
		createMenuPoint(Labels.quit, Labels.exit);
	}

	public void createMenuPoint(String name, String... items) {
		JMenu m = new JMenu(name);
		this.add(m);
		for(String s : items) {
			JMenuItem mi = new JMenuItem(s);
			m.add(mi);
			mi.addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("The following menu has been called: " + e.getActionCommand());
		String cmd = e.getActionCommand();
		if(cmd.equals(Labels.aboutUs)) {
			new AboutUsDialog(mw);
		}
	}
	
	
}
