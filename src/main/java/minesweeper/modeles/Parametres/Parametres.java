package minesweeper.modeles.Parametres;


import commun.debogage.J;
import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{
	
	
	private int difficulte;
	private int taille;
	
	@Override
	public int getTaille() {
		J.appel( this );
		return taille;
	}
	
	@Override
	public int getDifficulte() {
		J.appel( this );
		return difficulte;
	}
	
	public void setTaille(int taille) {
		J.appel( this );
		this.taille = taille;
	}
	
	public void setDifficulte(int difficulte) {
		J.appel( this );
		this.difficulte = difficulte;
	}
	

}
