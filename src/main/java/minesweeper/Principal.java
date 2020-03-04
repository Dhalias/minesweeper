package minesweeper;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import minesweeper_javafx.controleurs.ControleurPrincipalFX;
import minesweeper_javafx.vues.VuePrincipaleFX;

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
		
		DialogueModal.enregistreFenetrePrincipale(fenetrePrincipale);
	    
	    ChargeurDeVue<VuePrincipaleFX> chargeur;
	    chargeur = new ChargeurDeVue<VuePrincipaleFX>("/fxml/principal.xml",
	                                                  "traductions.chaines",
	                                                  "/css/principal.css");

	    VuePrincipaleFX vue = chargeur.getVue();
	    
	    DoitEtre.nonNul(vue);

	    FabriqueControleur.creerControleur(ControleurPrincipalFX.class, 
	                                       vue);
		
	    Scene scene = chargeur.nouvelleScene((float)25,(float)37.03,(float)1.50);
		
		
		fenetrePrincipale.setScene( scene );
		
		fenetrePrincipale.show();
		
		
	}
	
	@Override
	public void stop() {
		J.appel( this );
	}
}