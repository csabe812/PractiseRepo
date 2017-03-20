package com.github.csabe812.dartsy.controller;

import com.github.csabe812.dartsy.model.DartsyDAO;
import com.github.csabe812.dartsy.model.bean.Player;
import com.github.csabe812.dartsy.view.MainWindow;

public class DartsyController {
	
	private DartsyDAO dao;
	
	public DartsyController() {
		dao = new DartsyDAO();
	}
	
	public void startDesktop() {
		MainWindow mw = new MainWindow(this);
	}
	
	public boolean addPlayer(Player p) {
		return dao.addPlayer(p);
	}
}
