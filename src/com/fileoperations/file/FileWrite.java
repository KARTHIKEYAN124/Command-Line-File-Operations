package com.fileoperations.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileWrite {
    
    public static void WriteLinesToFile(ArrayList<String> lines, String outputPath) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
