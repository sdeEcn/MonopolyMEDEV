/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 * Case carte : soit case change soit communaute
 * @author Mael Guillossou
 */

public abstract class Carte extends NonAchetable {

    public Carte() {
        super("Carte");
    }
 public abstract String toString();
    /**
     * Pioche une carte et applique l'effet au joueur
     * @param j joueur qui pioche
     */
    public abstract void piocher(Joueur j);

    /**
     * Fonction utilitaire calculant les réparations à payer pour un certain joueur. Et le fait payer.
     * @param maison prix par maison
     * @param hotel prix par hotel
     * @param joueur joueur qui doit payer
     * @return le prix total à payer par le joueur
     */
    protected int reparation(int maison, int hotel, Joueur joueur) {
        int aPayer = 0;
        for (Achetable propriete: joueur.getProprietes()) {
            if(propriete instanceof Constructible) {
                aPayer += maison*((Constructible) propriete).getNbMaisons() + hotel*((Constructible) propriete).getNbHotels();
            }
        }

        joueur.setArgent(joueur.getArgent() - aPayer);

        return aPayer;
    }
    
}
