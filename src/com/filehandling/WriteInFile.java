package com.filehandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
	
	public static void writeFile(String filePath, String content) {
		  try (FileOutputStream fileOutput = new FileOutputStream(filePath)) {
			  fileOutput.write(content.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}