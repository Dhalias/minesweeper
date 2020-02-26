package minesweeper_client.commandes;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class FaireDebutPartie extends Commande<FaireDebutPartiePourEnvoi, FaireDebutPartieRecue>
		implements FaireDebutPartiePourEnvoi, FaireDebutPartieRecue {
	private int difficulte;
	private int taille;

	@Override
	public int getDifficulte() {
		J.appel( this );
		return difficulte;
	}

	@Override
	public int getTaille() {
		J.appel( this );
		return taille;
	}

	@Override
	public void setDifficulte( int difficulte ) {
		J.appel( this );
		this.difficulte = difficulte;

	}

	@Override
	public void setTaille( int taille ) {
		J.appel( this );
		this.taille = taille;

	}
}
