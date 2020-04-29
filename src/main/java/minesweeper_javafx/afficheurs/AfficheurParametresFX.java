package minesweeper_javafx.afficheurs;

import commun.debogage.J;
import minesweeper.modeles.Parametres.ParametresLectureSeule;
import minesweeper_client.afficheurs.AfficheurParametres;
import minesweeper_javafx.vues.VueParametresFX;

public class AfficheurParametresFX extends AfficheurParametres<VueParametresFX>{

	@Override
	public void initialiserAffichage( ParametresLectureSeule modeleLectureSeule, VueParametresFX vue ) {
		J.appel( this );
		
		
		vue.changerCouleurArrierrePlan();
		
		
		
	}

	@Override
	public void rafraichirAffichage( ParametresLectureSeule modeleLectureSeule, VueParametresFX vue ) {
		J.appel( this );
		
		System.out.println( "\n [INFORMATIONS]\tLa taille de la carte est de "+modeleLectureSeule.getTaille()+"\n");
		System.out.println( "\n [INFORMATIONS]\tLa difficulte  est de "+modeleLectureSeule.getDifficulte()+"\n");
		
		vue.changerCouleurArrierrePlan();
		
	}

}
