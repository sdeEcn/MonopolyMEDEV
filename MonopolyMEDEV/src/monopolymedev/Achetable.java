/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author sarah
 */
public abstract class Achetable extends Case {

    /**
     * Prix d'achat de la case
     */
    protected int prix;

    /**
     *  Joueur possédant la case si elle a été achetée
     */
    protected Joueur proprietaire;

    /**
     *  Loyer que les autres joueurs doivent lui payer
     */
    protected int loyer;

    //constructeur

    /**
     *
     */
    public Achetable() {

    }

    /**
     *
     * @param nom
     * @param p
     * @param prop
     * @param loy
     */
    public Achetable(String nom, int p, Joueur prop, int loy) {
        super(nom);
        prix = p;
        proprietaire = prop;
        loyer = loy;
    }

    //getters, setters

    /**
     *
     * @return
     */
    public int getPrix() {
        return prix;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     *
     * @return
     */
    public int getLoyer() {
        return loyer;
    }

    /**
     *
     * @param loyer
     */
    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    /**
     *
     * @return
     */
    public Joueur getProprietaire() {
        return proprietaire;
    }

    /**
     *
     * @param proprietaire
     */
    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }

    //methodes

    /**
     *
     * @param prop
     * Le joueur (prop) souhaite acheter la case : on vérifie s'il a de l'argent avant de lui attribuer la case et d'encaisser
     */
    public void acheter(Joueur prop) {
        if (prop.getArgent() >= this.prix) {
            prop.setArgent(prop.getArgent() - this.prix);
            this.proprietaire = prop;
        } else {
            System.out.println("Le joueur n'a pas les moyens pour cette case");
        }
    }

    /**
     *  Méthode permettant de calculer le loyer d'après les maisons construites
     */
    public abstract int calculLoyer(Joueur j);

}
