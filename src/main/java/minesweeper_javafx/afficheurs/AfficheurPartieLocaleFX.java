package minesweeper_javafx.afficheurs;

import commun.debogage.J;
import minesweeper.modeles.PartieLocale.PartieLocaleLectureSeule;
import minesweeper_client.afficheurs.AfficheurPartieLocale;
import minesweeper_javafx.vues.VuePartieLocaleFX;

public class AfficheurPartieLocaleFX extends AfficheurPartieLocale<VuePartieLocaleFX>{

	@Override
	public void initialiserAffichage( PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue ) {
		J.appel( this );
		
	}

	@Override
	public void rafraichirAffichage( PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue ) {
		J.appel( this );
		
	}

}
