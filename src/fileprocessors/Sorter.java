package fileprocessors;

import java.util.List;

import file.operations.FileRead;
import file.operations.FileWrite;

public class Sorter {

	public static void SortAsc(String filePath1, String outputPath) throws Exception {
        List<String> lines = FileRead.readLinesFromFile(filePath1);

        // Sort lines in ascending order without considering case sensitivity
        lines.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        FileWrite.WriteLinesToFile(lines, outputPath);
    }


	public static void SortDesc(String filePath1, String outputPath) throws Exception {
        List<String> lines = FileRead.readLinesFromFile(filePath1);

        // Sort lines in descending order without considering case sensitivity
        lines.sort((s1, s2) -> s2.compareToIgnoreCase(s1));

        FileWrite.WriteLinesToFile(lines, outputPath);
    }
    public static void SortAscCaseSens(String filePath1, String outputPath) throws Exception {
        List<String> lines = FileRead.readLinesFromFile(filePath1);

        // Sort lines in ascending order (case-sensitive)
        lines.sort(String::compareTo);

        FileWrite.WriteLinesToFile(lines, outputPath);
    }

    public static void SortDescCaseSens(String filePath1, String outputPath) throws Exception {
        List<String> lines = FileRead.readLinesFromFile(filePath1);

        // Sort lines in descending order (case-sensitive)
        lines.sort((s1, s2) -> s2.compareTo(s1));

        FileWrite.WriteLinesToFile(lines, outputPath);
    }
}
