package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		
		//PrintStream ps = new PrintStream("texto2.txt");
		PrintWriter ps = new PrintWriter("texto2.txt");
		ps.println("Faço qualquer coisa pela minha familia.");
		ps.println();
		ps.println();
		ps.println("AMO MAIS QUE TUDO");
		
		ps.close();
		
		
	}

}
