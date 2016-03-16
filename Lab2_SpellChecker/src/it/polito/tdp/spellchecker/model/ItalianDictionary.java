package it.polito.tdp.spellchecker.model;

import java.io.*;

public class ItalianDictionary extends Dictionary {
	public ItalianDictionary(){
		super();
	}
	
	public void LoadDictionary(){
		try{
			FileReader fr=new FileReader("rsc/Italian.txt");
			BufferedReader br=new BufferedReader(fr);
			String word="";
			while((word=br.readLine())!=null){
				//System.out.println("ita");
				this.parole.add(word);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("Errore lettura file");
		}
		 	
		}
}
