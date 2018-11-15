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
                System.out.println("Allez gare de lyon");
                joueur.setPosition(15);
                break;
            case 7:
                System.out.println("Amende pour excès de vitesse 1 500");
                joueur.setArgent(joueur.getArgent() - 1500);
                break;
            case 8:
                System.out.println("Payez frais de scolarité 15 000 ");
                joueur.setArgent(joueur.getArgent() + 15000);
                break;
            case 9:
                System.out.println("Reculez de trois cases");
                joueur.setPosition(joueur.getPosition() - 3);
                break;
            case 10:
                System.out.println("Réparation dans maison (2500/maison 10 000/Hotel)");
                int aPayer = 0;
                for (Achetable propriete: joueur.getProprietes()) {
                    if(propriete instanceof Constructible) {
                        aPayer += 2500*((Constructible) propriete).getNbMaisons() + 10000*((Constructible) propriete).getNbHotels()
                    }
                }

                joueur.setArgent(joueur.getArgent() - aPayer);
                break;
            case 11:
                System.out.println("Votre prêt rapporte 15000");
                joueur.setArgent(joueur.getArgent() + 15000);
                break;
            case 12:
                System.out.println("Libéré de prison");


        }
    }
}
