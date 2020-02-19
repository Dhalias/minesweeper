package minesweeper_javafx.controleurs;

import commun.debogage.J;
import minesweeper_client.controleurs.ControleurParametres;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.vues.VueParametresFX;

public class ControleurParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX> {

	@Override
	public void demarrer() {
		J.appel( this );
		
	}

}
