package minesweeper_client.controleurs;

import commun_client.mvc.controleurs.ControleurModeleVue;
import minesweeper.modeles.Parametres.Parametres;
import minesweeper.modeles.Parametres.ParametresLectureSeule;
import minesweeper_client.afficheurs.AfficheurParametres;
import minesweeper_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>
		extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A> {

}
