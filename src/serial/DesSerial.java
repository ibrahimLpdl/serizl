package serial;

import java.io.*;
import java.util.ArrayList;


public class DesSerial{
	public static void main(String args[]) { 
		  try { 
		      FileInputStream fichier = new FileInputStream("personnes.obj"); 
		      ObjectInputStream s = new ObjectInputStream(fichier); 
		      ArrayList<Personne> lesPersonnes = (ArrayList) s.readObject(); 
			
			for(Personne unePersonne : lesPersonnes){
		      
		    	  System.out.println("Personne : "); 
		      System.out.println("nom : " + unePersonne.getNom()+"\n"+"Prenom : "
		      + unePersonne.getPrenom()+"\n"+"Année : " + unePersonne.getAnnee()+"\n");
		      
		      }
		    }  
		    catch (IOException e) { 
		      e.printStackTrace(); 
		    } 
		    catch (ClassNotFoundException e) { 
		      e.printStackTrace(); 
		    } 
	  }


}
