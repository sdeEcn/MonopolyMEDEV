/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Classe qui represente le plateau de jeu, il contient la liste des joueurs et la liste des cases
 * @author Thibault
 */
public class Plateau {
    private ArrayList<Case> cases; 
    private LinkedList<Joueur> joueurs; 
    
    public Plateau(){
        this.cases=new ArrayList<>();
        this.joueurs=new LinkedList<>();
    }

    public Plateau(ArrayList<Case> cases, LinkedList<Joueur> joueurs) {
        this.cases = cases;
        this.joueurs = joueurs;
    }
    
    

    public ArrayList<Case> getCases() {
        return cases;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setCases(ArrayList<Case> cases) {
        this.cases = cases;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    public void initPlateau(){
        this.cases.add(new DepartOuTaxe());
        this.cases.add(new Constructible());
        this.cases.add(new Communaute());
        this.cases.add(new Constructible());
        this.cases.add(new DepartOuTaxe());
        this.cases.add(new Gare());
        this.cases.add(new Constructible());
        this.cases.add(new Chance());
        this.cases.add(new Constructible());
        this.cases.add(new Constructible());
        this.cases.add(new Prison());
        this.cases.add(new Constructible());
        this.cases.add(new Utilitaire());
        this.cases.add(new Constructible());
        this.cases.add(new Gare());
        this.cases.add(new Constructible());
        this.cases.add(new Communaute());
        this.cases.add(new Constructible());
        this.cases.add(new Constructible());
        this.cases.add(new Cagnotte());
        this.cases.add(new Constructible());
        this.cases.add(new Chance());
        this.cases.add(new Constructible());
        this.cases.add(new Constructible());
        this.cases.add(new Gare());
        this.cases.add(new Constructible());
        this.cases.add(new Constructible());
        this.cases.add(new Utilitaire());
        this.cases.add(new Constructible());
        this.cases.add(new GoToPrison());
        this.cases.add(new Constructible());
        this.cases.add(new Constructible());
        this.cases.add(new Communaute());
        this.cases.add(new Constructible());
        this.cases.add(new Gare());
        this.cases.add(new Chance());
        this.cases.add(new Constructible());
        this.cases.add(new DepartOuTaxe());
        this.cases.add(new Constructible());
        
    }
    
    /**
     * Méthode qui affiche toutes les cases du plateau
     */
    public void affiche(){
        for(Case c : this.cases){
            System.out.println(c.toString());
        }
    }
    
}
