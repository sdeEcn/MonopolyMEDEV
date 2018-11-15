/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

import java.util.ArrayList;

/**
 *
 * @author Robin
 */
public class MonopolyMEDEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plateau jeu = new Plateau();
        
        jeu.initPlateau();
        for (int i =1;i<5;i++){
            jeu.getJoueurs().add(new Joueur("J"+i,100000,0,new ArrayList<>(),new ArrayList<>(),0,jeu,0));
        }
        while(!jeu.finPartie()){
            jeu.tourDeJeu();
        }
    }
    
}
