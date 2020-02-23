package minesweeper_javafx.afficheurs;

import commun.debogage.J;
import minesweeper.modeles.Parametres.ParametresLectureSeule;
import minesweeper_client.afficheurs.AfficheurParametres;
import minesweeper_javafx.vues.VueParametresFX;

public class AfficheurParametresFX extends AfficheurParametres<VueParametresFX>{

	@Override
	public void initialiserAffichage( ParametresLectureSeule modeleLectureSeule, VueParametresFX vue ) {
		J.appel( this );
		
		
		vue.changerCouleurArrierrePlan(modeleLectureSeule.getCouleur());
		
	}

}
