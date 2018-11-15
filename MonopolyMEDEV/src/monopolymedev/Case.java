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

    
   

    /**
     * Constructeur de Case
     * @param c case que l'on cree
     */
    public Case(Case c) {
        this.nom = c.getNom();
        
    }
    
    /**
     * Constructeur par défaut de Case
     */
    public Case() {
        this.nom = "inconnu";
    }
    
    
    
    
    /**
     *  Methode toString() de la classe Case
     *  Permet de généré une desciption d'un objet de la classe Case
     *  @return
     */
    
    @Override
    public String toString() {
        return "Nom de la case  : " + nom ;
    }
    
}
