package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static String readFromFile(String filePath) {
        StringBuilder fileText = new StringBuilder();
        try (FileInputStream fileInput = new FileInputStream(filePath)) {
            int data;
            while ((data = fileInput.read()) != -1) {
                fileText.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileText.toString();
    }

}