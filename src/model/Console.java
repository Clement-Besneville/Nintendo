package model;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected int prix;
	protected LocalDate date;

	public Console(String nom, int prix, LocalDate date) {
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}

}
