package alexLeeTutorial;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader38 {

	public static void main(String[] args) throws IOException {
		
		// http://textfiles.com/100/captmidn.txt
		
		// Simply write this code to open the file and get the text from it line by line using a scanner.
		File file = new File("C:\\Users\\kbang\\OneDrive\\Desktop\\captmidn.txt");
		Scanner scan = new Scanner(file);

		
		//First, open the file by creating using File("path/to/file.txt"); 
		//then scan through the file line by line using Scanner to read from the file BY WHILE LOOP
		
		String fileContent = "THIS IS A NEW FILE MADE BY US";
		while (scan.hasNextLine()) {
		System.out.println(scan.nextLine());
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		
		// If you want to write to a new file simply use FileWriter(""path/to/newfile.txt"");

//		FileWriter writer = new FileWriter("C:\\Users\\kbang\\OneDrive\\Desktop\\newfile.txt");
//		writer.write(fileContent);
//		writer.close();
//		scan.close();
	}
}
