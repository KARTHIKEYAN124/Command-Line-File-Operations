package main;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import file.operations.Config;
import fileprocessors.LineRemover;
import fileprocessors.Sorter;

public class FileOperations {

    private static final Logger logger = Logger.getLogger(FileOperations.class.getName());

    static {
        // Configure logger to write to log file specified in config
        try {
            String logFilePath = Config.getInstance().get("log.file.path");
            FileHandler fileHandler = new FileHandler(logFilePath);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            // Failed to configure logger, log the exception
            logger.log(Level.SEVERE, "Failed to configure logger", e);
        }
    }

    public static void main(String[] args) {
        try {
            Config.init(); // Initialize the Config class
            
            String filePath1 = Config.getInstance().get("file1.path");
            String filePath2 = Config.getInstance().get("file2.path");
            String outputPath = Config.getInstance().get("output.path");

            
          //  int result = 1 / 0;

            String operation;
            if (args.length < 1) {
                System.out.println("Usage: java FileOperations <operation>");
                return;
            } else {
                operation = args[0];
            }

            switch (operation) {
                case "1":
                    System.out.println("Sorting file 1 in ascending order...");
                    Sorter.SortAsc(filePath1, outputPath);
                    System.out.println("File sorted successfully.");
                    break;
                case "2":
                    System.out.println("Sorting file 1 in descending order...");
                    Sorter.SortDesc(filePath1, outputPath);
                    System.out.println("File sorted successfully.");
                    break;
                case "3":
                    System.out.println("Sorting file 1 in ascending order (case-sensitive)...");
                    Sorter.SortAscCaseSens(filePath1, outputPath);
                    System.out.println("File sorted successfully.");
                    break;
                case "4":
                    System.out.println("Sorting file 1 in descending order (case-sensitive)...");
                    Sorter.SortDescCaseSens(filePath1, outputPath);
                    System.out.println("File sorted successfully.");
                    break;
                case "5":
                    System.out.println("Removing lines from file 1 that are in file 2...");
                    LineRemover.removeLinesFromFile2(filePath1, filePath2, outputPath);
                    System.out.println("Lines removed successfully.");
                    break;
                case "6":
                    System.out.println("Removing lines from file 1 that are not in file 2...");
                    LineRemover.removeLinesNotInFile2(filePath1, filePath2, outputPath);
                    System.out.println("Lines removed successfully.");
                    break;
                default:
                    System.out.println("Invalid operation code. Please provide a valid operation code.");
                    break;
            }
        } catch (Exception e) {
            // Log the exception
            logger.log(Level.SEVERE, "An error occurred", e);
            System.out.println("An error occurred. Please check the log for details.");
        }
    }
}
