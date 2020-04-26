package minesweeper_javafx.controleurs;

import commun.debogage.J;
import minesweeper_client.controleurs.ControleurPartieLocale;
import minesweeper_javafx.afficheurs.AfficheurPartieLocaleFX;
import minesweeper_javafx.vues.VuePartieLocaleFX;

public class ControleurPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX>  {

	@Override
	protected void installerReceptionCommandes() {
		J.appel( this );
		
	}

	@Override
	protected void demarrer() {
		J.appel( this );
		
	}

}
