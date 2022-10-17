package application.manFile;

import java.io.File;
import java.util.Scanner;

public class ManipulateFiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();//path to read/write
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);//read folders in path
		
		System.out.println("Folders");
		for(File folder : folders ) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);//read files in path
		System.out.println("Files:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();//create folder in path
		System.out.println("Created! " + success);
		
		sc.close();
	}

}
