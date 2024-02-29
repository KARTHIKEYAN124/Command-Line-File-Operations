package com.fileoperations.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class FileWrite {

    public static void WriteLinesToFile(List<String> lines, String outputPath) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
