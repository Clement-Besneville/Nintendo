package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Hybride;
import model.Jeu;
import model.Portable;
import model.Salon;

public class Test {

	public static void main(String[] args) {
		List<Jeu> jeux = new ArrayList();

		Console sw = new Hybride("Switch",0,null);
		Console wii = new Salon("Wii",0,null);
		Console gb = new Portable("GameBoy",0,null);

		Jeu J1 = new Jeu("Pokemon Unite", sw, null);
		Jeu J2 = new Jeu("Zelda : BOTW", sw, null);
		Jeu J3 = new Jeu("Super MArio Galaxy", wii, null);
		Jeu J4 = new Jeu("Zelda : Twilight Princess", wii, null);
		Jeu J5 = new Jeu("Pokemon Rouge", gb, null);

		Collections.addAll(jeux, J1, J2, J3, J4, J5);

		for (Jeu j : jeux)
		{
			System.out.println("Les jeux crés sont : " + j);
		}

		Adresse adresse1 = new Adresse("10", "rue de la Revanche", "Paris");
		Boutique boutique1 = new Boutique("Micromania", adresse1);
		Client client1 = new Client("Cesar", "Jules");
		Client client2 = new Client("Mandela", "Nelson");
	}

}
