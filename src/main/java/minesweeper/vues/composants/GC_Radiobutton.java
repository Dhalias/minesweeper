/**
 * 
 */
package minesweeper.vues.composants;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import commun.debogage.J;
import javafx.beans.NamedArg;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class GC_Radiobutton extends VBox {

	public GC_Radiobutton( @NamedArg("rb1") String rb1_Name, @NamedArg("rb2") String rb2_Name,
			@NamedArg("rb3") String rb3_Name, @NamedArg("title") String title ) {

		super();
		J.appel( this );
		ToggleGroup tg = new ToggleGroup();

		this.getChildren().add( AjouterVBoxTitre( title ) );
		this.getChildren().add( AjouterBouton( rb1_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb2_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb3_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );

	}

	private RadioButton AjouterBouton( String texte, ToggleGroup tg ) {
		J.appel( this );

		RadioButton rb = new RadioButton( texte );
		rb.setToggleGroup( tg );
		rb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( rb, Priority.ALWAYS );

		return rb;
	}

	private VBox AjouterVBoxVide() {
		J.appel( this );

		VBox vb = new VBox();

		vb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( vb, Priority.ALWAYS );

		return vb;
	}

	private VBox AjouterVBoxTitre( String texte ) {
		J.appel( this );

		VBox vb = new VBox();

		vb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( vb, Priority.ALWAYS );

		Text text = new Text( texte );
		text.getStyleClass().add( "titreToggleGroup" );

		vb.getChildren().add( text );

		return vb;

	}

}
