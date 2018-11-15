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
 *
 * @author Antoine Cottineau
 */
public class Joueur {

    /**
     * Nom du joueur.
     */
    protected String nom;

    /**
     * Quantité d'argent du joueur.
     */
    protected int argent;

    /**
     * Nombre de tours restants avant que le joueur puisse sortir de prison.
     */
    private int etatPrison;

    /**
     * Liste de toutes les cases possédées par le joueur.
     */
    protected List<Achetable> proprietes;

    /**
     * Le joueur possède-t-il la carte sortie de prison
     */
    protected boolean carteSortiePrison;

    /**
     * Position du joueur sur le plateau.
     */
    protected int position;

    /**
     * Valeur du dernier lancer de dé.
     */
    protected int dernierLancer;

    /**
     * Constructeur de Joueur.
     *
     * @param nom Nom du joueur.
     * @param argent Quantité d'argent du joueur.
     * @param etatPrison Nombre de tours restants avant que le joueur puisse
     * sortir de prison.
     * @param proprietes Liste de toutes les cases possédées par le joueur.
     * @param carteSortiePrison booléen qui indique si le joueur possède la
     * carte sortie de prison
     * @param position Position du joueur sur le plateau.
     * @param dernierLancer Valeur du dernier lancer de dé.
     */
    public Joueur(String nom, int argent, int etatPrison, List<Achetable> proprietes, boolean carteSortiePrison, int position, int dernierLancer) {
        this.nom = nom;
        this.argent = argent;
        this.etatPrison = etatPrison;
        this.proprietes = proprietes;
        this.carteSortiePrison = carteSortiePrison;
        this.position = position;
        this.dernierLancer = dernierLancer;
    }

    /**
     * Constructeur de Joueur.
     *
     * @param joueur Joueur à copier.
     */
    public Joueur(Joueur joueur) {
        this.nom = joueur.nom;
        this.argent = joueur.argent;
        this.etatPrison = joueur.etatPrison;
        this.proprietes = joueur.proprietes;
        this.carteSortiePrison = joueur.carteSortiePrison;
        this.position = joueur.position;
        this.dernierLancer = joueur.dernierLancer;
    }

    /**
     * Constructeur par défaut de Joueur.
     */
    public Joueur() {
        this.nom = "";
        this.argent = 0;
        this.etatPrison = 0;
        this.proprietes = new ArrayList<>();
        this.carteSortiePrison = false;
        this.position = 0;
        this.dernierLancer = 0;
    }

    /**
     * Transfère la somme d'argent passée en argument depuis ce joueur jusqu'au
     * joueur passé en argument.
     *
     * @param joueur Joueur à qui donner de l'argent.
     * @param somme Somme à transférer.
     */
    public void payer(Joueur joueur, int somme) {
        if (this.argent < somme) { //Le joueur n'a plus assez d'argent.
            System.out.println("Le joueur n'a plus d'argent.");

            joueur.setArgent(joueur.getArgent() + this.argent);
            this.argent = 0;
        } else { //Le joueur a suffisament d'argent.
            joueur.setArgent(joueur.getArgent() + somme);
            this.argent -= somme;
        }
    }

    /**
     * Renvoie le nombre de gares possédées par le joueur.
     *
     * @return Le nombre de gares possédées par le joueur.
     */
    public int nbGares() {
        int nbGares = 0;
        for (Case caseM : proprietes) {
            if (caseM instanceof Gare) {
                nbGares++;
            }
        }
        return nbGares;
    }

    /**
     * calcule le nombre de cases utilitaires que possède un joueur
     *
     * @param j le joueur
     * @return le nombre de cases utilitaires
     */
    public int nbUtilitaire() {
        int c = 0;
        for (int i = 0; i < this.proprietes.size(); i++) {
            if (this.proprietes.get(i) instanceof Utilitaire) {
                c = c + 1;
            }
        }
        return c;
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

    public int getEtatPrison() {
        return etatPrison;
    }

    public void setEtatPrison(int etatPrison) {
        this.etatPrison = etatPrison;
    }

    public List<Achetable> getProprietes() {
        return proprietes;
    }

    public void setProprietes(List<Achetable> proprietes) {
        this.proprietes = proprietes;
    }

    public boolean isCarteSortiePrison() {
        return carteSortiePrison;
    }

    public void setCarteSortiePrison(boolean carteSortiePrison) {
        this.carteSortiePrison = carteSortiePrison;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDernierLancer() {
        return dernierLancer;
    }

    public void setDernierLancer(int dernierLancer) {
        this.dernierLancer = dernierLancer;
    }

    /**
     * Permet de faire avancer le joueur du nombre qui est en paramètre de la
     * méthode
     *
     * @param de valeur du du definissant de combien le joueur avance
     */
    public void avance(int de) {
        if (this.getPosition() + de > 39) {
            this.setPosition(de - (39 - this.getPosition()) - 1);
        } else {
            this.setPosition(this.getPosition() + de);
        }
    }
}
