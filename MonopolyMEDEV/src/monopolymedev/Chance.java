/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
     */
    public String toString(){
    return "il s'agit d'une carte chance"; }
    
    /**
     *
     * @param j
     */
    public void piocher(Joueur joueur){
        Random random = new Random();
        switch(random.nextInt()){
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
                joueur.setArgent(j.getArgent()-15000);
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
                
        }
    }
}
