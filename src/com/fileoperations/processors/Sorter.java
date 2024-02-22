package com.fileoperations.processors;

import java.util.ArrayList;
import java.util.Collections;

import com.fileoperations.file.FileRead;
import com.fileoperations.file.FileWrite;

public class Sorter {

    public static void sortAsc(String filePath1, String outputPath) throws Exception {
        // Read lines from file
        ArrayList<String> lines = FileRead.ReadLinesFromFile(filePath1);

        // Sort lines in ascending order
        Collections.sort(lines);

        // Write sorted lines to output file
        FileWrite.WriteLinesToFile(lines, outputPath);
    }

    public static void sortDesc(String file1Path, String outputPath) throws Exception {
        // Read lines from file
        ArrayList<String> lines = FileRead.ReadLinesFromFile(file1Path);

        // Sort lines in descending order
        Collections.sort(lines, Collections.reverseOrder());

        // Write sorted lines to output file
        FileWrite.WriteLinesToFile(lines, outputPath);
    }

    public static void sortAscCaseSens(String file1Path, String outputPath) throws Exception {
        // Read lines from file
        ArrayList<String> lines = FileRead.ReadLinesFromFile(file1Path);

        // Sort lines in ascending order (case-sensitive)
        lines.sort(String::compareTo);

        // Write sorted lines to output file
        FileWrite.WriteLinesToFile(lines, outputPath);
    }

    public static void sortDescCaseSens(String file1Path, String outputPath) throws Exception {
        // Read lines from file
        ArrayList<String> lines = FileRead.ReadLinesFromFile(file1Path);

        // Sort lines in descending order (case-sensitive)
        lines.sort((s1, s2) -> s2.compareTo(s1));

        // Write sorted lines to output file
        FileWrite.WriteLinesToFile(lines, outputPath);
    }
}
