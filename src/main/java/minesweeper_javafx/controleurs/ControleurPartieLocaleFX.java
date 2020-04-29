package minesweeper_javafx.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.commandes.JouerCoupPartieLocale;
import minesweeper_client.commandes.JouerCoupPartieLocaleRecue;
import minesweeper_client.controleurs.ControleurPartieLocale;
import minesweeper_javafx.afficheurs.AfficheurPartieLocaleFX;
import minesweeper_javafx.vues.VuePartieLocaleFX;

public class ControleurPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX>  {

	@Override
	protected void installerReceptionCommandes() {
		J.appel( this );
		
		installerRecepteurCommande(JouerCoupPartieLocale.class, new RecepteurCommandeMVC<JouerCoupPartieLocaleRecue>() {

			@Override
			public void executerCommandeMVC( JouerCoupPartieLocaleRecue commande ) {
				J.appel( this );
				int indexColonne = Character.getNumericValue( commande.getIdCase().charAt( 0 ) );
				int indexLigne = Character.getNumericValue(commande.getIdCase().charAt( 2 ));
				System.out.println( "\nindexColonne = "+indexColonne+"\nindexLigne"+indexLigne );
				modele.ajouterBouton(indexColonne,indexLigne);
			}
	    });
		
	}

	@Override
	protected void demarrer() {
		J.appel( this );
		
		int[][] tableauJeu = creerTableauJeu();
		modele.setTableauJeu(tableauJeu);
	}

	private int[][] creerTableauJeu() {
		int[][] tableauJeu = new int[6][30/6];
		
		ajouterBombes(tableauJeu);
		remplirChiffres(tableauJeu);
		
		for ( int i = 0; i < tableauJeu.length; i++ ) {
			System.out.println(  );
			for ( int j = 0; j < tableauJeu[i].length; j++ ) {
				System.out.println( tableauJeu[i][j] + " " );
			}
		}
		
		return tableauJeu;
		
	}

	private void remplirChiffres( int[][] tableauJeu ) {
		for ( int i = 0; i < tableauJeu.length; i++ ) {
			for ( int j = 0; j < tableauJeu[i].length; j++ ) {
				if ( tableauJeu[i][j] != 9 ) {
					tableauJeu[i][j] = 1;
				}
				//calculerBombesProche(tableauJeu,i,j);
			}
		}
		
	}

	private void calculerBombesProche( int[][] tableauJeu,int indexColonne, int indexLigne ) {
		if(tableauJeu[indexColonne][indexLigne] != 9) {
			int nbBombes = 0;
			if ( indexLigne != 0 ) {
				
			}
		}
		
	}

	private void ajouterBombes( int[][] tableauJeu ) {

		tableauJeu[0][0] = 9;
		tableauJeu[1][0] = 9;
		tableauJeu[2][0] = 9;
		
	}

}
