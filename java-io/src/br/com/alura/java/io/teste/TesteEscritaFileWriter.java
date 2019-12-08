package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("texto2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"));
		bw.write("Faço qualquer coisa pela minha familia.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Vou me dedicar mais.");
		
		bw.close();
		
		
	}

}
