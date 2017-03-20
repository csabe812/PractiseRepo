package com.github.csabe812.view.dialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.csabe812.view.Labels;
import com.github.csabe812.view.MainWindow;

public class AboutUsDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 838514221412053744L;

	private MainWindow mw;
	
	private JLabel aboutUsLogo;
	private JLabel name;
	private JButton okButton;
	
	public AboutUsDialog(MainWindow mw) {
		super(mw.getMainWindow());
		this.mw = mw;
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 1));
		
		aboutUsLogo = new JLabel("About us");
		name = new JLabel("Created by: Csaba Fulop");
		okButton = new JButton(Labels.okButton);
		
		jp.add(aboutUsLogo);
		jp.add(name);
		jp.add(okButton);
		okButton.addActionListener(this);
		
		getContentPane().add(jp);
		pack();
        setLocationRelativeTo(mw.getMainWindow());
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == Labels.okButton) {
			this.setVisible(false);
		}
	}

}
