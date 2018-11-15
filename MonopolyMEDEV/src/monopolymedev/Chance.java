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
    public void piocher(Joueur j){
        Random random = new Random();
        switch(random.nextInt()){
            case 0: 
                System.out.println("Amende pour excès de vitesse : 1 000 F");
                j.setArgent(j.getArgent()-1000);
                break;
            case 1:
                System.out.println("La banque vous verse un dividende de 5 000 F");
                j.setArgent(j.getArgent()+5000);
                break;
            case 3:
                System.out.println("Vous êtes imposé pour les réparations de voirie");
                this.reparation(2500, 10000, j);
                break;
            case 4:
                break;
        }
    }
}
