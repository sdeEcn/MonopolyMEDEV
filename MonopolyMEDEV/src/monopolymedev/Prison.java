/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 * case prison
 *
 * @author spectre x360
 */
public class Prison extends NonAchetable {

    /**
     * Attribut:
     *
     * @param prixSortie montant fixe à payer pour pouvoir sortir
     */
    private int prixSortie;

    /**
     * constructeur
     *
     * @param prix prix de sortie
     */
    public Prison(int prix) {
        super("Prison");
        this.prixSortie = prix;
    }

    //getter / setter
    public void setPrixSortie(int p) {
        this.prixSortie = p;
    }

    public int getPrixSortie() {
        return this.prixSortie;
    }

    /*methode pour payer la caution
      
     *@param j le joueur qui veut payer 
      *sortie true paiement effectué
      *false paiement refusé
     */
    public static boolean payerSortie(Joueur j) {
        //on vérifie si le joueur est en prison
        int prixSortie = 20000;
        if (j.isEtatPrison() != 0) {
            //on vérifie si il a assez d'argent
            if (j.getArgent < prixSortie) {
                System.out.println("pas assez d'argent");
                return false;
            } else {
                //on effectue le paiement
                j.setArgent(j.getArgent() - prixSortie);
                //on met à jour son statut
                j.setEtatPrison(0);
                System.out.println("joueur" + j + "vous etes libres");
                return true;
            }

        } else {
            System.out.println("Vous n'etes pas en prison");
            return false;
        }
    }

    /*utilisation d'une carte
    *@param j le joueur qui veut utiliser sa carte
    *sortie true opération réussie
    *false non réussie
     */
    public static boolean utiliserCarte(Joueur j) {
        // on vérifie si le joueur possède une carte qui permet de sortir de prison
        if (j.isCarteSortiePrison()) {
            //on libère le joueur
            j.setEtatPrison(0);
            System.out.println("joueur" + j + "vous etes libres");
            //on retire sa carte
            j.setCarteSortiePrison(false);
            return true;
        } else {
            System.out.println("vous n'avez pas de carte sortie de prison");
            return false;
        }

    }

    public String toString() {
        return ("Prison \n caution à payer pour sortir:" + this.prixSortie);
    }

}
