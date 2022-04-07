
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFilename = scan.nextLine();
		System.out.println("Enter the output file name");
		String outputFilename = scan.nextLine();
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		System.out.println("File is copied");
		br.close();
		bw.close();
        scan.close();
	}

}