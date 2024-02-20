package com.fileoperations.file;

import java.util.ArrayList;

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
                    sorter.sortAsc(filePath1);
                    break;
                case "2":
                    // Sort Descending
                    sorter.sortDesc(filePath1);
                    break;
                case "3":
                    // Sort Ascending (Case Sensitive)
                    sorter.sortAscCaseSensitive(filePath1);
                    break;
                case "4":
                    // Sort Descending (Case Sensitive)
                    sorter.sortDescCaseSensitive(filePath1);
                    break;
                case "5":
                    // Remove lines in file 1 that are in file 2
                    lineRemover.removeLinesFromFile2(filePath1, filePath2);
                    break;
                case "6":
                    // Remove lines from file 1 that are not in file 2
                    lineRemover.removeLinesNotInFile2(filePath1, filePath2);
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
