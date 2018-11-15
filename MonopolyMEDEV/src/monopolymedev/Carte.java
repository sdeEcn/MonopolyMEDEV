/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author Mael Guillossou
 */

public abstract class Carte extends NonAchetable {

    public Carte() {
        super();
    }
    
    public abstract void piocher(Joueur j);

    protected int reperation(int maison, int hotel, Joueur joueur) {
        System.out.println("Réparation dans maison (2500/maison 10 000/Hotel)");
        int aPayer = 0;
        for (Achetable propriete: joueur.getProprietes()) {
            if(propriete instanceof Constructible) {
                aPayer += 2500*((Constructible) propriete).getNbMaisons() + 10000*((Constructible) propriete).getNbHotels();
            }
        }

        joueur.setArgent(joueur.getArgent() - aPayer);

        return aPayer;
    }
    
}
