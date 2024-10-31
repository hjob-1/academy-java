package com.bptn.course._34_jdbc_postgresql;

import java.sql.Connection;

public class DbMain {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();

		Connection conn = toDoList.createConnection();
		toDoList.getAllUsers(conn);
		toDoList.closeConnection(conn);

	}

}
