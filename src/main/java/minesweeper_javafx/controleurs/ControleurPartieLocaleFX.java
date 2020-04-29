package minesweeper_javafx.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.commandes.JouerCoupPartieLocale;
import minesweeper_client.commandes.JouerCoupPartieLocaleRecue;
import minesweeper_client.commandes.QuitterFinPartie;
import minesweeper_client.commandes.QuitterFinPartieRecue;
import minesweeper_client.controleurs.ControleurPartieLocale;
import minesweeper_javafx.afficheurs.AfficheurPartieLocaleFX;
import minesweeper_javafx.vues.VuePartieLocaleFX;

public class ControleurPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX> {

	@Override
	protected void installerReceptionCommandes() {
		J.appel( this );

		installerRecepteurCommande( JouerCoupPartieLocale.class,
				new RecepteurCommandeMVC<JouerCoupPartieLocaleRecue>() {

					@Override
					public void executerCommandeMVC( JouerCoupPartieLocaleRecue commande ) {
						J.appel( this );
						int indexColonne = Character.getNumericValue( commande.getIdCase().charAt( 0 ) );
						int indexLigne = Character.getNumericValue( commande.getIdCase().charAt( 2 ) );
						System.out.println( "\nindexColonne = " + indexColonne + "\nindexLigne" + indexLigne );
						modele.ajouterBouton( indexColonne, indexLigne );
					}
				} );

		installerRecepteurCommande( QuitterFinPartie.class, new RecepteurCommandeMVC<QuitterFinPartieRecue>() {

			@Override
			public void executerCommandeMVC( QuitterFinPartieRecue commande ) {
				J.appel( this );
				System.out.println( "Quitter la partie." );
				System.exit( 0 );

			}
		} );

	}

	@Override
	protected void demarrer() {
		J.appel( this );

		int[][] tableauJeu = creerTableauJeu();
		modele.setTableauJeu( tableauJeu );
	}

	private int[][] creerTableauJeu() {
		J.appel( this );
		int[][] tableauJeu = new int[6][30 / 6];

		ajouterBombes( tableauJeu );
		remplirChiffres( tableauJeu );

		return tableauJeu;

	}

	private void ajouterBombes( int[][] tableauJeu ) {
		J.appel( this );
		tableauJeu[0][0] = 9;
		tableauJeu[5][3] = 9;
		tableauJeu[1][2] = 9;
		tableauJeu[3][1] = 9;
		tableauJeu[4][4] = 9;

	}

	private void remplirChiffres( int[][] tableauJeu ) {
		J.appel( this );
		for ( int i = 0; i < tableauJeu.length; i++ ) {
			for ( int j = 0; j < tableauJeu[i].length; j++ ) {
				if ( tableauJeu[i][j] != 9 ) {
					tableauJeu[i][j] = calculerBombesProche( tableauJeu, i, j );
				}
			}
		}

	}

	private int calculerBombesProche( int[][] tableauJeu, int indexColonne, int indexLigne ) {
		J.appel( this );
		int nbBombes = 0;
		for ( int i = -1; i < 2; i++ ) {
			for ( int j = -1; j < 2; j++ ) {
				if ( !isOutOfBound( tableauJeu, indexColonne + i, indexLigne + j ) ) {
					int valeurEmplacement = tableauJeu[indexColonne + i][indexLigne + j];
					if ( valeurEmplacement == 9 ) {
						nbBombes++;
					}
				}
			}

		}

		return nbBombes;

	}

	private boolean isOutOfBound( int[][] tableauJeu, int indexColonne, int indexLigne ) {
		J.appel( this );
		boolean isOutOfBound = false;
		try {
			int val = tableauJeu[indexColonne][indexLigne];
		} catch ( Exception indexOutOfBoundException ) {
			isOutOfBound = true;
		}

		return isOutOfBound;
	}

}
