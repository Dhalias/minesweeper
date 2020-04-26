package minesweeper.vues.composants;

import commun.debogage.J;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class GrilleDuJeu extends VBox{

	public GrilleDuJeu () {
		super();
		J.appel( this );
		final int TAILLECARTE = 18;
		
		
		Button[] tableauBouton = creerTableauBouton(TAILLECARTE);
		GridPane grilleDuJeu = creerGrilleBouton(tableauBouton);
				
		this.getChildren().add( new Text("Test") );
		this.getChildren().add( grilleDuJeu );
	}

	private GridPane creerGrilleBouton( Button[] tableauBouton ) {
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
		
		Button[] tableauBouton = new Button[tailleCarte];
		
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			Button button = new Button("X");
			tableauBouton[i] = button;
			System.out.println( tableauBouton.length );
		}
		
		return tableauBouton;
		
	}
}
