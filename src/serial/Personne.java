package serial;

import java.io.Serializable;

public class Personne implements Serializable  {

	private String nom;
	private String prenom;
	private int annee;
	
	public Personne(String nom, String pre, int i) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom =pre;
		this.annee = i;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
