package minesweeper.vues.composants;

import java.awt.event.MouseEvent;
import java.util.List;

import commun.debogage.J;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.scene.layout.GridPane;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GrilleDuJeu extends VBox{
	
	private Button[][] tableauBouton;


	public GrilleDuJeu () {
		super();
		J.appel( this );
		final int TAILLECARTE = 30;
		
		
		this.tableauBouton = creerTableauBouton(TAILLECARTE);
		GridPane grilleDuJeu = creerGrilleBouton(this.tableauBouton);
				
		this.getChildren().add( grilleDuJeu );
	}
	
	public Button[][] getTableauBouton() {
		J.appel( this );
		return this.tableauBouton;
	}
	

	private GridPane creerGrilleBouton( Button[][] tableauBouton ) {
		J.appel( this );
		GridPane grilleDuJeu = new GridPane();
		
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			for ( int j = 0; j < tableauBouton[i].length; j++ ) {
				grilleDuJeu.add( tableauBouton[i][j], i, j );
			}
		}
		
		return grilleDuJeu;
		
	}

	private Button[][] creerTableauBouton( int tailleCarte) {
		J.appel( this );
		Button[][] tableauBouton = new Button[6][tailleCarte/6];
		
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			for ( int j = 0; j < tableauBouton[i].length; j++ ) {
				Button button = new Button(" ");
				button.setId( i+"-"+j );			
				tableauBouton[i][j] = button;
				System.out.println( tableauBouton.length );
			}
			
		}
		
		return tableauBouton;
		
	}

	public boolean afficherBoutons(List<int[]> boutons,int[][] tableauJeu) {
		J.appel(this);
		boolean finJeu = false;
		
		for(int[] idBouton : boutons) {
			int indexColonne = idBouton[0];
			int indexLigne = idBouton[1];
			tableauBouton[indexColonne][indexLigne].setText( Integer.toString(tableauJeu[indexColonne][indexLigne] ));
			if ( tableauJeu[indexColonne][indexLigne] == 9 ) {
				finDuJeu(tableauJeu);
				finJeu = true;
			}
		}
		
		return finJeu;
	}

	private void finDuJeu(int[][] tableauJeu) {
		J.appel( this );
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			for ( int j = 0; j < tableauBouton[i].length; j++ ) {
				if(tableauJeu[i][j] == 9) {
					tableauBouton[i][j].setText( "X" );
				}else {
					tableauBouton[i][j].setText( Integer.toString(tableauJeu[i][j] ));
				}
				
			}
			
		}
		
	}
	
}
