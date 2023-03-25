package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = user.nextLine();

		File fileInput = new File(filePath);

		System.out.println("What is the search word you are looking for?");
		String searchWord = user.nextLine();

		System.out.println("Should the search be case sensitive? (Y/N)");
		boolean isCaseSensitive = user.nextLine().equalsIgnoreCase("Y");

		int lineCount = 1;

		try (Scanner fileContent = new Scanner(fileInput)) {
			while (fileContent.hasNextLine()) {
				String line = fileContent.nextLine();
				if (isCaseSensitive) {
					if (line.contains(searchWord)) {
						System.out.println(lineCount + ") " + line);

					}
				} else {
					if (line.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineCount + ") " + line);
					}
				}
				lineCount++;
			}

		} catch (FileNotFoundException fnf) {
			System.out.println("File is not found: " + fileInput.getAbsolutePath());
		}

	}

}
