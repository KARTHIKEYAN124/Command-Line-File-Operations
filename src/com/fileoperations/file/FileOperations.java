package com.fileoperations.file;

import com.fileoperations.processors.Sorter;
import com.fileoperations.processors.LineRemover;


public class FileOperations {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileOperations <operation>");
            return;
        }

        String operation = args[0];

        try {
            Config config = Config.getInstance(); // Assuming Config is a singleton class to handle configuration
            String filePath1 = config.getProperty("file1.path");
            String filePath2 = config.getProperty("file2.path");
            String outputPath = config.getProperty("output.path");

            switch (operation) {
                case "1":
                    // Sort Ascending
                    Sorter.sortAsc(filePath1, outputPath);
                    break;
                case "2":
                    // Sort Descending
                    Sorter.sortDesc(filePath1, outputPath);
                    break;
                case "3":
                    // Sort Ascending (Case Sensitive)
                    Sorter.sortAscCaseSens(filePath1, outputPath);
                    break;
                case "4":
                    // Sort Descending (Case Sensitive)
                    Sorter.sortDescCaseSens(filePath1, outputPath);
                    break;
                case "5":
                    // Remove lines in file 1 that are in file 2
                    LineRemover.removeLinesFromFile2(filePath1, filePath2, outputPath);
                    break;
                case "6":
                    // Remove lines from file 1 that are not in file 2
                    LineRemover.removeLinesNotInFile2(filePath1, filePath2, outputPath);
                    break;
                default:
                    System.out.println("Invalid operation code. Please provide a valid operation code.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
