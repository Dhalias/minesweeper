package minesweeper_client.vues;
import java.util.List;

import commun_client.mvc.Vue;

public interface VuePartieLocale extends Vue {
	
	void afficherBoutons(List<Integer> boutons);

}
