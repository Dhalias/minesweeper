package minesweeper_client.commandes;

import commun_client.commandes.CommandeRecue;

public interface FaireDebutPartieRecue extends CommandeRecue{
	int getDifficulte();
	int getTaille();
}
