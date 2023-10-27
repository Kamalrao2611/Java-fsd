package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile {
	public static void appendToFile(String filePath, String content) {
        try (FileOutputStream fileOutput = new FileOutputStream(filePath, true)) {
            fileOutput.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}