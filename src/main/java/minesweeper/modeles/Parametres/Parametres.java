package minesweeper.modeles.Parametres;

import java.util.Random;

import commun.debogage.J;
import commun.modeles.Modele;
import javafx.scene.paint.Color;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{
	private int numCouleur = (int) (Math.random()*4);
	private String couleur = calculerCouleur();
	
	@Override
	public int getNumCouleur() {
		J.appel( this );
		return numCouleur;
	}
	
	private String calculerCouleur() {
		J.appel( this );
		String couleur = "grey";
		switch ( numCouleur ) {
		case 0:
			couleur = "coral";
			break;
		case 1:
			couleur = "green";
			break;
		
		case 2:
			couleur = "darkRed";
			break;
			
		case 3:
			couleur = "blue";
			break;
		}
		return couleur;
	}

	@Override
	public  String getCouleur() {
		return couleur;
	}

}
