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
                System.out.println("Vous payer "+this.reperation(2500, 10000, joueur));
                break;
            case 11:
                System.out.println("Votre prêt rapporte 15000");
                joueur.setArgent(joueur.getArgent() + 15000);
                break;
            case 12:
                System.out.println("Libéré de prison");
                joueur.setCarteSortiePrison(true);
                break;
            case 13:
                System.out.println("Rdv rue de la paix");
                joueur.setPosition(39);
                break;
            case 14:
                System.out.println("Voirie 4000/maison 11500/hotel");
                System.out.println("Vous payer "+this.reperation(4000, 11500, joueur));
                break;
            case 15:
                System.out.println("La banque vous verse 5000");
                joueur.setArgent(joueur.getArgent() + 5000);
        }
    }
}
