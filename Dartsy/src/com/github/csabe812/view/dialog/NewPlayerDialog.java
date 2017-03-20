package com.github.csabe812.view.dialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.csabe812.view.Labels;
import com.github.csabe812.view.MainWindow;

public class NewPlayerDialog extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = -654807286357667208L;
	
	private MainWindow mw;
	private JLabel name;
	private JLabel age;
	private JTextField nameTextField;
	private JTextField ageTextField;
	private JButton okButton;
	private JButton cancelButton;
	
	public NewPlayerDialog(MainWindow mw) {
		//Initialization
		this.mw = mw;
		name = new JLabel("Name:");
		age = new JLabel("Age:");
		nameTextField = new JTextField();
		ageTextField = new JTextField();
		okButton = new JButton(Labels.okButton);
		cancelButton = new JButton(Labels.cancelButton);
		
		//Setting
		setTitle(Labels.addNewPlayer);
		setLayout(new GridLayout(3, 2));
		add(name);
		add(nameTextField);
		add(age);
		add(ageTextField);
		add(okButton);
		okButton.addActionListener(this);
		add(cancelButton);
		cancelButton.addActionListener(this);
		
		//Visibiltiy
		pack();
        setLocationRelativeTo(mw.getMainWindow());
        
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("The following button has been clicked: " + e.getActionCommand());
		if(e.getActionCommand() == Labels.okButton) {
			//...pampampam
			setVisible(false);
		} else if(e.getActionCommand() == Labels.cancelButton) {
			setVisible(false);
		}
	}
}
