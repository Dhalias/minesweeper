package minesweeper_client.commandes;

import commun_client.commandes.CommandePourEnvoi;

public interface FaireDebutPartiePourEnvoi extends CommandePourEnvoi{
	void setDifficulte(int difficulte);
	void setTaille(int taille);
}
