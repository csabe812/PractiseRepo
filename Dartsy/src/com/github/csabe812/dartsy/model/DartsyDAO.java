package com.github.csabe812.dartsy.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.github.csabe812.dartsy.model.bean.Player;

public class DartsyDAO {
	private static final String DATABASE_FILE = System.getenv("DartsyDB");
	private static final String ADD_PLAYER = "INSERT INTO PLAYERS (name, age) VALUES (?, ?)";

	public DartsyDAO() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to connect JDBC");
			e.getStackTrace();
		}
	}

	public boolean addPlayer(Player p) {
		boolean isOk = false;

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_FILE);
			pst = conn.prepareStatement(ADD_PLAYER);

			int index = 1;
			pst.setString(index++, p.getName());
			pst.setInt(index++, p.getAge());

			int rowAffected = pst.executeUpdate();
			if (rowAffected == 1) {
				isOk = true;
			}
		} catch (SQLException e) {
			System.out.println("Failed to execute adding player");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("Failed to close connection");
				e.printStackTrace();
			}
			try {
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				System.out.println("Failed to close statement");
				e.printStackTrace();
			}
		}
		return isOk;
	}
}
