package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		//Fluxo de Entrada e leitura de um arquivo
		InputStream fis = s.getInputStream();//System.in; new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		//Fluxo de saída e escrita em uma arquivo
		OutputStream fos = s.getOutputStream();//System.out;//new FileOutputStream("texto2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		bw.close();
		br.close();
	}

}
