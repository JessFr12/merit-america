package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		System.out.println("What file would you like to write to?");
		String filePath = user.nextLine();

		File destinationFile = new File(filePath);

		try(PrintWriter writer = new PrintWriter(new FileOutputStream(destinationFile))) {
			for (int i = 1; i <= 300;i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					writer.println("FizzBuzz");
				} else if (i % 3 == 0) {
					writer.println("Fizz");
				} else if (i % 5 == 0) {
					writer.println("Buzz");
				} else {
					writer.println(i);
				}
			}
		} catch(FileNotFoundException fnf) {
			System.out.println("Invalid destination file: " + destinationFile.getAbsolutePath());
		}

	}

}
