/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Classe qui represente le plateau de jeu, il contient la liste des joueurs et
 * la liste des cases
 *
 * @author Thibault
 */
public class Plateau {

    private ArrayList<Case> cases;
    private LinkedList<Joueur> joueurs;

    public Plateau() {
        this.cases = new ArrayList<>();
        this.joueurs = new LinkedList<>();
    }

    public Plateau(ArrayList<Case> cases, LinkedList<Joueur> joueurs) {
        this.cases = cases;
        this.joueurs = joueurs;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    /**
     * 
     * @param j joueur
     * @return renvoie le nombre de gares possédées par le joueur j
     */
    public int nbGare(Joueur j) {
        int res = 0;
        for (Case c : j.getProprietes()) {
            if (c instanceof Gare) {
                res++;
            }
        }
        return res;
    }
    

    /**
     * Permet de verifier si la partie doit se terminier ou non
     *
     * @return Booleen correspondant à la fin de la partie (true) ou non (false)
     */
    public boolean finPartie() {
        if (joueurs.size() == 1 && joueurs.get(0).getArgent() > 0) {
            return true;
        } else if (joueurs.size() > 1) {
            int i = joueurs.size();
            for (Joueur j : joueurs) {
                if (j.getArgent() == 0) {
                    i--;
                }
            }
            if (i == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
