import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a path: ");
		String path = sc.nextLine();
		
		File arquivo = new File(path);
		new File(path + "\\subdir").mkdir();
		
		File[] folders = arquivo.listFiles(File::isDirectory); //isFile
		System.out.println("Foldes: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		sc.close();
		
	}	
	
}
