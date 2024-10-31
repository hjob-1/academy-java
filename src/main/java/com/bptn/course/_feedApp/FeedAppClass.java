package com.bptn.course._feedApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FeedAppClass {
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "feedApp";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return conn;

	}

	public void addUser(Connection conn, String firstName, String lastName, String username, String phone,
			String emailId, String password, boolean emailVerified) {

		PreparedStatement stmt = null;
		String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, username);
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);
			int resultCount = stmt.executeUpdate();
			stmt.close();
			System.out.println(resultCount + " record(s) inserted");
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.out.println("Exception:" + ex.getMessage());
		}

	}

	public void getAllUsers(Connection conn) {
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM \"user\"";
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.print("User ID: " + rs.getInt("userId") + " \t");
				System.out.print("First Name: " + rs.getString("firstName") + " \t");
				System.out.print("last name: " + rs.getString("lastName") + " \t");
				System.out.print("username: " + rs.getString("username") + " \t");
				System.out.print("Phone : " + rs.getString("phone") + " \t");
				System.out.print("Email Id: " + rs.getString("emailId") + " \t");
				System.out.print("password: " + rs.getString("password") + " \t");
				System.out.println("email Verified: " + rs.getString("emailVerified") + " \t");

			}
		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}

	}

	boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException e) {
			flag = false;
			System.out.println("Exception:" + e.getMessage());
		}

		return flag;
	}
}
