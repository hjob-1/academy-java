package com.bptn.course.week_2_Challenge;

import java.util.Scanner;

class Player {

	private String name;

	private String playerNumber;
	// Question: should scanner be static or not?
	private static Scanner scanner = new Scanner(System.in);

	public Player(String name, String playerNumber) {
		this.name = name;
		this.playerNumber = playerNumber;
	}

	// Create getter methods
	public String getName() {
		return name;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public int makeMove() {
		System.out.println("Make your move. What column do you want to put a token in?");
		int column = scanner.nextInt();
		return column;
	}

	public String toString() {
		return ("Player " + playerNumber + " is " + name);
	}

}
