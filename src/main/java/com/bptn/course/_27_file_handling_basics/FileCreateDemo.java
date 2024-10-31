package com.bptn.course._27_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This a new file");

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}