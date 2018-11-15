/*
 * Ecole Centrale de Nantes Option Informatique
 * MEDEV TP 1
 * MONOPOLY
 */
package monopolymedev;

import java.util.Random;

/**
 *
 * @author Mael Guillossou
 */
public class Chance extends Carte{
    
    /**
     *
     */
    public Chance(){
        super();
    }
        /**
     *  Methode toString() de la classe Chance
     *  Permet de générer une desciption de la carte
     * @return 
     */
    public String toString(){
        return "Case chance - piocher une carte"; }
    
    /**
     *
     * @param joueur
     */
    public void piocher(Joueur joueur){
        Random random = new Random();
        switch(random.nextInt(9)){
            case 0: 
                System.out.println("Amende pour excès de vitesse : 1 000");
                joueur.setArgent(joueur.getArgent()-1000);
                break;
            case 1:
                System.out.println("La banque vous verse un dividende de 5 000");
                joueur.setArgent(joueur.getArgent()+5000);
                break;
            case 3:
                System.out.println("Vous êtes imposé pour les réparations de voirie (2 500/maison 10 000/hotel)");
                this.reparation(2500, 10000, joueur);
                break;
            case 4:
                System.out.println("Avancez jusqu'à la case départ");
                joueur.setPosition(0);
                joueur.actionCase();
                break;
            case 5:
                System.out.println("Payez les frais de scolarité : 15 000");
                joueur.setArgent(joueur.getArgent()-15000);
                break;
            case 6:
                System.out.println("Rendez-vous Rue de la Paix");
                joueur.setPosition(39);
                joueur.actionCase();
                break;
            case 7:
                System.out.println("Libéré de prison");
                joueur.setCarteSortiePrison(true);
                break;
            case 8:
                System.out.println("Rendez-vous à l'Avenue Henri-Martin.");
                if(joueur.getPosition()>24){
                    joueur.setPosition(0);
                    joueur.actionCase();
                }
                joueur.setPosition(24);
                joueur.actionCase();
                break;
        }
    }
}
