package minesweeper;

import javax.naming.PartialResultException;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import minesweeper.modeles.Parametres.Parametres;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.controleurs.ControleurParametresFX;
import minesweeper_javafx.vues.VueParametresFX;

public class Principal extends Application{
	static {
		J.appel( Principal.class );
		Initialisateur.initialiser();
	}
	
	public static void main(String[] args) {
		J.appel( Principal.class );
		
		launch(args);
	}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception {
		J.appel( this );
		
		Scene scene = creerScenePrincipale();
		
		fenetrePrincipale.setScene( scene );
		
		fenetrePrincipale.show();
	}
	
	private Scene creerScenePrincipale() {
		J.appel( this );
		
		ChargeurDeVue<VueParametresFX> chargeur; 
		chargeur = new ChargeurDeVue<VueParametresFX>("/fxml/parametres.xml","traductions.chaines","/css/parametres.css");
		
		VueParametresFX vue = chargeur.getVue();
		
		DoitEtre.nonNul( vue );
		
		Parametres parametres = new Parametres();
		
		AfficheurParametresFX afficheur = new AfficheurParametresFX();
		
		FabriqueControleur.creerControleur( ControleurParametresFX.class, parametres, vue, afficheur );
		
		Scene scene = chargeur.nouvelleScene((float)25,(float)37.03,(float)1.50);
		
		DoitEtre.nonNul( scene );
		
		return scene;
	}
	
	@Override
	public void stop() {
		J.appel( this );
	}
}