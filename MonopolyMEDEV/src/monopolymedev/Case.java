/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 * Modélise une case du plateau
 * Classe-mere abstraite de tous les types de cases du plateau
 * @author Clement
 */
public abstract class Case {
    
    /**
     * Attributs :
     *  nom de la case
     *  numero de la case sur le plateau
     */
    protected String nom;
    protected int position;

    
    /**
     * Getters et Setters de Case
     * @return 
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPosition() {
        return position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }    
    
    
    /**
     * Constructeur de Case
     * @param nom nom de la nouvelle case
     * @param position position de la nouvelle case
     */
    
    public Case(String nom, int position) {
        this.nom = nom;
        this.position = position;
    }

    /**
     * Constructeur de Case
     * @param c case que l'on cree
     */
    public Case(Case c) {
        this.nom = c.getNom();
        this.position = c.getPosition();
    }
    
    /**
     * Constructeur par défaut de Case
     */
    public Case() {
        this.nom = "inconnu";
        this.position = 0;
    }   

}
