package application.writter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferFileWitter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = new String[] {"Good morning", "good afternoon", "Good night", "good"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
