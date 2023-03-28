package com.techelevator;


import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("What is the search word? ");
        String searchWord = user.nextLine();

        System.out.println("What is the replacement word? ");
        String replaceWord = user.nextLine();

        System.out.println("What is the source file?");
        String sourcePath = user.nextLine();

        System.out.println("What is the destination file? ");
        String destinationPath = user.nextLine();

        File sourceFile = new File(sourcePath);

        File destFile = new File(destinationPath);

        StringBuilder sb = new StringBuilder();

        try(Scanner inputFile = new Scanner(sourceFile)) {
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File does not exist: " + sourceFile.getAbsolutePath());
        }

        String updateText = sb.toString().replaceAll(searchWord,replaceWord);

        try(PrintWriter outputFile = new PrintWriter(new FileOutputStream(destFile))) {
            outputFile.println(updateText);
        } catch (FileNotFoundException fnf) {
            System.out.println("Invalid destination file: " + destFile.getAbsolutePath());
        }

    }

}
