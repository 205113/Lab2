package it.polito.tdp.spellchecker.model;

import java.util.*;

public class TestModel {

	public static void main(String[] args) {
		Dictionary i= new ItalianDictionary();
		Dictionary e= new EnglishDictionary();
		e.LoadDictionary();
		i.LoadDictionary();
		List<String> frase= new LinkedList<String>();
		frase.add("ciao");
		frase.add("belllo");
		List<RichWord> rw= i.spellCheckTest(frase);
		if(rw.size()>0)
			System.out.println(rw.get(0).getParola());
		else
			System.out.println("italiano corretto");
		List<String> phrase= new LinkedList<String>();
		frase.add("hi");
		frase.add("beuty");
		List<RichWord> rw2= e.spellCheckTest(phrase);
		if(rw2.size()>0)
			System.out.println(rw2.get(0).getParola());
		else
			System.out.println("inglese corretto");
	}

}
