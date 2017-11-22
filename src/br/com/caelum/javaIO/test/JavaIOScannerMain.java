package br.com.caelum.javaIO.test;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class JavaIOScannerMain {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("file.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("exit.txt")));		
//      PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			bw.write(line);
			bw.newLine();
		}
		
		sc.close();
		bw.close();
	}
}
