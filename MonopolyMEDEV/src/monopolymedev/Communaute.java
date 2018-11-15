/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

import java.util.Random;

/**
 * Classe représentant une carte Communaute
 * @author Mael Guillossou
 */
public class Communaute extends Carte {

    public Communaute() {
    }

    /**
     * Pioche une carte communauté et applique l'effet au joueur
     * @param joueur
     */
    public void piocher(Joueur joueur) {
        Random random = new Random();
        switch (random.nextInt(12)) {
            case 0:
                System.out.println("Aller au départ");
                GoToPrison.envoyerPrison(joueur);
                break;
            case 1:
                System.out.println("Aller au départ");
                joueur.setPosition(0);
                break;
            case 2:
                System.out.println("Aller Boulevard de la vilette");
                joueur.setPosition(11);
                break;
            case 3:
                System.out.println("Amende pour ivresse 2000");
                joueur.setArgent(joueur.getArgent() - 2000);
                break;
            case 4:
                System.out.println("Vous avez gagné mot-croisés 10000");
                joueur.setArgent(joueur.getArgent() + 10000);
                break;
            case 5:
                System.out.println("Allez rue Henri Martin");
                joueur.setPosition(24);
                break;
            case 6:
                System.out.println("Allez gare de lyon");case 7:
                System.out.println("Amende pour excès de vitesse 1 500");
                joueur.setArgent(joueur.getArgent() - 1500);
                joueur.setPosition(15);
                break;


        }
    }
}
