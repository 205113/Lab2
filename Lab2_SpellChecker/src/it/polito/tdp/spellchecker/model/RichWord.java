package it.polito.tdp.spellchecker.model;

public class RichWord {
	private String parola;
	private Boolean corretto;
	public RichWord(String parola, Boolean corretto) {
		this.parola = parola;
		this.corretto = corretto;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public Boolean getCorretto() {
		return corretto;
	}
	public void setCorretto(Boolean corretto) {
		this.corretto = corretto;
		
	}
	
	public boolean equals(RichWord r){
		if(this.parola.compareTo(r.getParola())==0)
			return true;
		else
			return false;
	}
}
