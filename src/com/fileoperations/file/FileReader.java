package com.fileoperations.file;

import java.io.*;
import java.util.ArrayList;

public class FileReader {
    
    public static ArrayList<String> readFileLines(Config config) throws Exception {
        ArrayList<String> lines = new ArrayList<>();
        String filePath = config.getProperty("file.path");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }
}
