package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\in.txt"); //caminho do arquivo
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Input error: " + e.getMessage());
		}
		finally {
			if(sc != null)
				sc.close();
		}
		

	}
	

}
