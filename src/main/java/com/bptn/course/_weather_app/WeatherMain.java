package com.bptn.course._weather_app;

import java.sql.Connection;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();

		// Created a new connection
		Connection conn = jdbc.createConnection();
		// add new user to our database
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		// close the connection
		jdbc.closeConnection(conn);
	}

}
