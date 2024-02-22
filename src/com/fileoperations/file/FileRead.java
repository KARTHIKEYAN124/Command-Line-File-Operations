package com.fileoperations.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileRead {
    
    public static ArrayList<String> ReadLinesFromFile(String filePath) throws Exception {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }
}
