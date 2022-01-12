package model;

public class Adresse {
	
	private String numero ;
	private String rue ; 
	private String ville ;
	
	
	
	public Adresse(String numero, String rue, String ville) {
		
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getRue() {
		return rue;
	}



	public void setRue(String rue) {
		this.rue = rue;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
	} 
	
	

}
