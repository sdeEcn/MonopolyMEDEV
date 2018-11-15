/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 * @author sarah
 */
public abstract class Achetable extends Case {

    /**
     * @param args the command line arguments
     */
    private int prix;
    protected Joueur proprietaire;
    protected int loyer;
    
    //constructeur
    public Achetable(){
        
    }
    public Achetable(String nom, int pos, int p, Joueur prop, int loy){
        super(nom, pos);
        prix = p;
        proprietaire = prop;
        loyer = loy;
    }
    
    //getters, setters
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    //methodes
    public void acheter(){
        
    }
    public abstract void calculLoyer();
    

    
}
