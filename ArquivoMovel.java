package Projeto.de.Revis.o.model.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Projeto.de.Revis.o.model.domain.Movel;

public class ArquivoMovel {
	public static void main(String[] args) {
		String dir ="C:/java/";
		String arq ="moveis.txt";	
		try {
			try {
				FileReader fileI = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileI);
				FileWriter fileO = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileO);
				String linha = leitura.readLine();
				while(linha != null){
					campos = linha.split(";");
					
					Movel movel = new Movel();
					movel.setDescricao(campos[2]);
					movel.setQtdeGaveta(Integer.valueOf(campos[3]));
					movel.setRoda(Boolean.valueOf(campos[0]));
					movel.setTamanho(Float.valueOf(campos[1]));
					movel.impressao();
					
					linha = leitura.readLine();
				}
				
				
				
					leitura.close();
					fileI.close();
					escrita.close();
					fileO.close();
				}catch(IOException e) {
				System.out.println(e.getMessage());
			}
	} finally {
		System.out.println("Processamento foi realizado com sucesso!");
	}
 }		
}	


