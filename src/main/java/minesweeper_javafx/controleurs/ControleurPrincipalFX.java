package minesweeper_javafx.controleurs;

import commun.debogage.J;
import minesweeper_client.controleurs.ControleurParametres;
import minesweeper_client.controleurs.ControleurPrincipal;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.afficheurs.AfficheurPrincipalFX;
import minesweeper_javafx.vues.VuePrincipaleFX;

public class ControleurPrincipalFX extends ControleurPrincipal<VuePrincipaleFX, AfficheurPrincipalFX> {

	@Override
	public void demarrer() {
		J.appel( this );
		
	}

}
