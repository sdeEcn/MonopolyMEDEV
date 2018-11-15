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
     *  Methode toString() de la classe communauté
     *  Permet de générer une description de la carte
     */
    public String toString(){
        return "Case communauté - piocher une carte";
    }

    /**
     * Pioche une carte communauté et applique l'effet au joueur
     * @param joueur
     */
    public static void piocher(Joueur joueur) {
        Random random = new Random();
        switch (random.nextInt(17)) {
            case 0:
                System.out.println("Allez en prison");
                GoToPrison.envoyerPrison(joueur);
                joueur.actionCase();
                break;
            case 1:
                System.out.println("Allez au départ");
                joueur.setPosition(0);
                joueur.setArgent(joueur.getArgent() + 40000);
                joueur.actionCase();
                break;
            case 2:
                System.out.println("Allez Boulevard de la villette");
                if(joueur.getPosition() > 11) {
                    joueur.setArgent(joueur.getArgent() + 20000);
                }
                joueur.setPosition(11);
                joueur.actionCase();
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
                if(joueur.getPosition() > 24) {
                    joueur.setArgent(joueur.getArgent() + 20000);
                }
                joueur.setPosition(24);
                joueur.actionCase();
                break;
            case 6:
                System.out.println("Allez gare de lyon");
                if(joueur.getPosition() > 15) {
                    joueur.setArgent(joueur.getArgent() + 20000);
                }
                joueur.setPosition(15);
                joueur.actionCase();
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
                joueur.setPosition((joueur.getPosition() - 3)%40);
                joueur.actionCase();
                break;
            case 10:
                System.out.println("Réparation dans maison (2500/maison 10 000/Hotel)");
                System.out.println("Vous devez payer "+this.reparation(2500, 10000, joueur));
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
                joueur.actionCase();
                break;
            case 14:
                System.out.println("Voirie 4000/maison 11500/hotel");
                System.out.println("Vous payer "+this.reparation(4000, 11500, joueur));
                break;
            case 15:
                System.out.println("La banque vous verse 5000");
                joueur.setArgent(joueur.getArgent() + 5000);
                break;
            case 16:
                System.out.println("Piochez une carte chance");
                Chance chance = new Chance();
                chance.piocher();
                break;
            default:
                System.out.println("Erreur...");
        }
    }
}
