package it.polito.tdp.spellchecker.model;

import java.util.*;

public class Dictionary {
	protected List<String> parole;
	public Dictionary() {
		this.parole = new LinkedList<String>();
	}
	
	public void LoadDictionary(){

		 	
		}
	public List<RichWord> spellCheckTest(List<String>inputTextList){
		List<RichWord> errate= new LinkedList<RichWord>();
		for(int i=0;i<inputTextList.size();i++){
			int j;
			//System.out.println(parole.size());
			for(j=0;j<parole.size();j++){
				if(parole.get(j).compareTo(inputTextList.get(i))==0)
					break;
			}
			//System.out.println(inputTextList.size());
			if(j==parole.size()){
				RichWord r= new RichWord(inputTextList.get(i),false);
				if(!errate.contains(r))
					errate.add(r);
			}
				
		}
		return errate;
	}
}
