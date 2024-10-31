package com.bptn.course._34_jdbc_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 
 * To get the port of the db connection
 * SELECT *
FROM pg_settings
WHERE name = 'port';
*/
public class ToDoList {
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "todolist";
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
		System.out.println("Connected to DB!");
		return conn;
	}

	public boolean closeConnection(Connection conn) {
		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException e) {
			flag = false;
			System.out.println("Exception:" + e.getMessage());
		}
		System.out.println("Connection Closed");
		return flag;
	}

	public void getAllUsers(Connection conn) {
		try {
			// Step 1 - Create the statement
			Statement myStatement = conn.createStatement();
			// Step 2 - Define the Query
			String myQuery = "SELECT * FROM users";
			// Step 3 - Execute/Run the Query and store the result
			ResultSet rs = myStatement.executeQuery(myQuery);
			while (rs.next()) {
				System.out.print("User Id: " + rs.getInt("userId") + "\t");
				System.out.print("User Name: " + rs.getString("username") + "\t");
				System.out.print("Email: " + rs.getString("email") + "\t");
				System.out.print("Created At: " + rs.getString("createdAt") + "\t");
				System.out.println();
			}
			myStatement.close();
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public void getTaskByDate(Connection conn, String dueDate) {
		try {
			Statement myStatement = conn.createStatement();
			String myQuery = "SELECT * FROM tasks WHERE \"dueDate\" = " + "'" + dueDate + "'";
			ResultSet rs = myStatement.executeQuery(myQuery);
			while (rs.next()) {
				System.out.print("Task Description: " + rs.getString("taskDescription"));
				System.out.println();
			}
			myStatement.close();
		} catch (SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
