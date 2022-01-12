package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		List<Jeu> jeux = new ArrayList();

		Console sw = new Console("Switch");
		Console wii = new Console("Wii");
		Console gb = new Console("GameBoy");

		Jeu J1 = new Jeu("Pokemon Unite", sw);
		Jeu J2 = new Jeu("Zelda : BOTW", sw);
		Jeu J3 = new Jeu("Super MArio Galaxy", wii);
		Jeu J4 = new Jeu("Zelda : Twilight Princess", wii);
		Jeu J5 = new Jeu("Pokemon Rouge", gb);

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
