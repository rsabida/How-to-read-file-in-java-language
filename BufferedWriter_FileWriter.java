package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = {"I", "am", "constantly", "trying", "explain", "something"};
		
		String arquivo = "C:\\Users\\Rober\\Desktop";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
			
			for(String linha: lines) {
				bw.write(linha);
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
	}	
	
}
