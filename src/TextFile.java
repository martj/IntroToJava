import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TextFile {

	public void zad1(String path) {
			File text = new File(path);
			Scanner fileReader;
			try {
				fileReader = new Scanner(text);
	
				while (fileReader.hasNextLine()) {
						System.out.println(fileReader.nextLine());
					if(fileReader.hasNextLine()){
						fileReader.nextLine();
					}
				}
				fileReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		TextFile test = new TextFile();
		test.zad1("//home//martj//Java//Nakov//Test");
	}
}


