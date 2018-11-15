package monopolymedev;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe représentant un des joueurs du Monopoly.
 * @author Antoine Cottineau
 */
public class Joueur {
    
    /**
     * Nom du joueur.
     */
    private String nom;
    
    /**
     * Quantité d'argent du joueur.
     */
    private int argent;
    
    /**
     * Vrai si le joueur est en prison, faux sinon.
     */
    private int etatPrison;
    
    /**
     * Liste de toutes les cases possédées par le joueur.
     */
    private List<Case> proprietes;
    
    /**
     * Liste de toutes les cartes possédées par le joueur.
     */
    private List<Carte> cartes;
    
    /**
     * Position du joueur sur le plateau.
     */
    private int position;

    /**
     * Constructeur de Joueur.
     * @param nom Nom du joueur.
     * @param argent Quantité d'argent du joueur.
     * @param etatPrison Vrai si le joueur est en prison, faux sinon.
     * @param proprietes Liste de toutes les cases possédées par le joueur.
     * @param cartes Liste de toutes les cartes possédées par le joueur.
     * @param position Position du joueur sur le plateau.
     */
    public Joueur(String nom, int argent, boolean etatPrison, List<Case> proprietes, List<Carte> cartes, int position) {
        this.nom = nom;
        this.argent = argent;
        this.etatPrison = etatPrison;
        this.proprietes = proprietes;
        this.cartes = cartes;
        this.position = position;
    }
    
    /**
     * Constructeur de Joueur.
     * @param joueur Joueur à copier.
     */
    public Joueur(Joueur joueur) {
        this.nom = joueur.nom;
        this.argent = joueur.argent;
        this.etatPrison = joueur.etatPrison;
        this.proprietes = joueur.proprietes;
        this.cartes = joueur.cartes;
        this.position = joueur.position;
    }
    
    /**
     * Constructeur par défaut de Joueur.
     */
    public Joueur() {
        this.nom = "";
        this.argent = 0;
        this.etatPrison = false;
        this.proprietes = new ArrayList<>();
        this.cartes = new ArrayList<>();
        this.position = 0;
    }
    
    /**
     * Transfère la somme d'argent passée en argument depuis ce joueur jusqu'au joueur passé en argument.
     * @param joueur Joueur à qui donner de l'argent.
     * @param somme Somme à transférer.
     */
    public void payer(Joueur joueur, int somme) {
        if(this.argent < somme) { //Le joueur n'a plus assez d'argent.
            System.out.println("Le joueur n'a plus d'argent.");
            
            joueur.setArgent(joueur.getArgent() + this.argent);
            this.argent = 0;
        } else { //Le joueur a suffisament d'argent.
            joueur.setArgent(joueur.getArgent() + somme);
            this.argent -= somme; 
        }
    }
    
    /*
    * Renvoie un entier entre 1 et 6
    */
    public static int lancerDe() {
        return ((int) Math.floor(Math.random() * 6)) + 1;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public boolean isEtatPrison() {
        return etatPrison;
    }

    public void setEtatPrison(boolean etatPrison) {
        this.etatPrison = etatPrison;
    }

    public List<Case> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Case> proprietes) {
        this.proprietes = proprietes;
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
