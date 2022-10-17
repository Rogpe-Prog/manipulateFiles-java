package application.allTogether;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllTogheter {

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
		
		System.out.print("Do you want to read (y/n)? ");
		char read = sc.next().charAt(0);
		if(read == 'y') {
			try (BufferedReader br = new BufferedReader(new FileReader(path))){
				String line = br.readLine();
				
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("Finish!");
		}
		

		sc.close();
	}

}
