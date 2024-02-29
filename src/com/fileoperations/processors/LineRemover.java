package com.fileoperations.processors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;

public class LineRemover {

    public static void removeLinesFromFile2(String file1Path, String file2Path, String outputPath) throws Exception {
        HashSet<String> linesFile2 = readLinesFromFile(file2Path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file1Path));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputPath)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!linesFile2.contains(line)) {
                    writer.println(line);
                }
            }
        }
    }

    public static void removeLinesNotInFile2(String file1Path, String file2Path, String outputPath) throws Exception {
        HashSet<String> linesFile2 = readLinesFromFile(file2Path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file1Path));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputPath)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (linesFile2.contains(line)) {
                    writer.println(line);
                }
            }
        }
    }

    private static HashSet<String> readLinesFromFile(String filePath) throws Exception {
        HashSet<String> lines = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
