package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EnglishDictionary extends Dictionary{
	public EnglishDictionary() {
		super();
		}

	public void LoadDictionary(){
		try{
			FileReader fr=new FileReader("rsc/Italian.txt");
			BufferedReader br=new BufferedReader(fr);
			String word="";
			while((word=br.readLine())!=null){
				//System.out.println("ing");
				this.parole.add(word);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("Errore lettura file");
		}
		 	
		}
}
