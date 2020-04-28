package minesweeper.vues.composants;

import java.awt.event.MouseEvent;

import commun.debogage.J;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.scene.layout.GridPane;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GrilleDuJeu extends VBox{
	
	private Button[] tableauBouton;

	public GrilleDuJeu () {
		super();
		J.appel( this );
		final int TAILLECARTE = 30;
		
		
		this.tableauBouton = creerTableauBouton(TAILLECARTE);
		GridPane grilleDuJeu = creerGrilleBouton(this.tableauBouton);
				
		this.getChildren().add( grilleDuJeu );
	}
	
	public Button[] getTableauBouton() {
		return this.tableauBouton;
	}
	

	private GridPane creerGrilleBouton( Button[] tableauBouton ) {
		J.appel( this );
		GridPane grilleDuJeu = new GridPane();
		int indexColonne = 0;
		int indexLigne = 0;
		
		for ( Button button : tableauBouton ) {
			grilleDuJeu.add( button, indexColonne, indexLigne );
			System.out.println( "IndexColonne = "+indexColonne + "\nIndexLigne = "+indexLigne );
			indexColonne++;
			
			if ( indexColonne == 6 ) {
				indexColonne = 0;
				indexLigne++;
			}
			
			
		}
		
		return grilleDuJeu;
		
	}

	private Button[] creerTableauBouton( int tailleCarte) {
		J.appel( this );
		Button[] tableauBouton = new Button[tailleCarte];
		
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			Button button = new Button("X");
			button.setId( Integer.toString(i) );			
			tableauBouton[i] = button;
			System.out.println( tableauBouton.length );
		}
		
		return tableauBouton;
		
	}
	
}
