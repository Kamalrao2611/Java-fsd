package com.filehandling;

public class FileHandling {

	public static void main(String[] args) {
		String filePath = "/Users/kamal/Desktop/file.txt";
		WriteInFile writeobj = new WriteInFile();
		writeobj.writeFile(filePath, "This is a sample text. ");
		
		
        
        AppendFile  apobj = new AppendFile();
        String str = "This text is appended";
        apobj.appendToFile(filePath, str);
        
        ReadFile readObj = new ReadFile();
		String fileContent = readObj.readFromFile(filePath);
        System.out.println("File Content: " + fileContent);
	}

}

