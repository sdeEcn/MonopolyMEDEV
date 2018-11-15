/*
 * Ecole Centrale de Nantes Option Informatique
 * MEDEV TP 1
 * MONOPOLY
 */
package monopolymedev;

/**
 * classe Gare, sous classe de Achetable
 *
 * @author Lilian
 */
public class Gare extends Achetable {

    //-----------------------------------------------
    //-----------------Constructeurs-----------------
    //-----------------------------------------------
    /**
     * Le constructeur de recopie
     */
    public Gare(int prix, String nom, Joueur proprietaire, int loyer) {
        super(nom, prix, proprietaire, loyer);
    }

    //-----------------------------------------------
    //-----------------Methode-----------------
    //----------------------------------------------- 
    /**
     * Retourne le loyer total en fonction du nombre de gare que le propriétaire
     * de la gare possède
     *
     * @param j Joueur se trouvant sur la gare
     */
    public int calculLoyer(Joueur j) {
        return proprietaire.nbGares() * 2500;
    }

    @Override
    public int calculLoyer() {
        return 1;
    }

    /**
     * Affiche dans la console les informations concernant a la gare.
     *
     * @return information de la gare.
     */
    @Override
    public String toString() {
        return "Case Gare: " + nom + ", possédée par " + proprietaire.getNom() + ". Le prix d'achat est " + prix
                + "€ et le loyer de base " + loyer + "€";
    }

}
