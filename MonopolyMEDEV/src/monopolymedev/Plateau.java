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
    /**
     * Méthode qui permet d'initialiser chaque case du tableau
     */
    public void initPlateau(){
        this.cases.add(new DepartOuTaxe('Depart',200));
        this.cases.add(new Constructible(60, 'Mediterranean Avenue',null,10));
        this.cases.add(new Communaute());
        this.cases.add(new Constructible(60,'Baltic Avenue',null,10));
        this.cases.add(new DepartOuTaxe('Income Taxe ',200));
        this.cases.add(new Gare(200,'Reading Railroad',null,0));
        this.cases.add(new Constructible(100,'Oriental Avenue',null,20));
        this.cases.add(new Chance());
        this.cases.add(new Constructible(100,'Vermont Avenue',null,20));
        this.cases.add(new Constructible(120,'Connecticut Avenue',null,20));
        this.cases.add(new Prison(50));
        this.cases.add(new Constructible(140,'St Charles Place',null,30));
        this.cases.add(new Utilitaire('Electricity Company',150,null,0));
        this.cases.add(new Constructible(140,'State Avenue',null,30));
        this.cases.add(new Constructible(160,'Virginie Avenue',null,30));
        this.cases.add(new Gare(200,'Pensylvania railRoad',null,0));
        this.cases.add(new Constructible(180,'St James Place',null,40));
        this.cases.add(new Communaute());
        this.cases.add(new Constructible(180,'Tennessie Avenue',null,40));
        this.cases.add(new Constructible(200,'New York Avenue',null,40));
        this.cases.add(new Cagnotte());
        this.cases.add(new Constructible(220,'Kentucky Avenue',null,50));
        this.cases.add(new Chance());
        this.cases.add(new Constructible(220,'St James Place',null,50));
        this.cases.add(new Constructible(240,'St James Place',null,50));
        this.cases.add(new Gare(200,'BAO Railroad',null,0));
        this.cases.add(new Constructible(260,'Atlantic Avenue',null,60));
        this.cases.add(new Constructible(260,'Ventnor Avenue',null,60));
        this.cases.add(new Utilitaire('Water Works',150,null,0));
        this.cases.add(new Constructible(280,'Marvin Gardens',null,60));
        this.cases.add(new GoToPrison());
        this.cases.add(new Constructible(300,'Pacific Avenue',null,70));
        this.cases.add(new Constructible(300,'North Carolina Avenue',null,70));
        this.cases.add(new Communaute());
        this.cases.add(new Constructible(320,'Pennsylvania Avenue',null,70));
        this.cases.add(new Gare(200,'Short Line',null,0));
        this.cases.add(new Chance());
        this.cases.add(new Constructible(350,'Park Place',null,80));
        this.cases.add(new DepartOuTaxe('Luxuary Taxe',1500));
        this.cases.add(new Constructible(400,'Boardwalk',null,90));
        
    }
    
    /**
     * Méthode qui affiche toutes les cases du plateau
     */
    public void affiche(){
        for(Case c : this.cases){
            System.out.println(c.toString());
        }
     /* 
     * @param j joueur
     * @return renvoie le nombre de gares possédées par le joueur j
     */
    public int nbGare(Joueur j) {
        int res = 0;
        for (Case c : j.getProprietes()) {
            if (c instanceof Gare) {
                res++;
            }
        }
        return res;
    }
    
}
