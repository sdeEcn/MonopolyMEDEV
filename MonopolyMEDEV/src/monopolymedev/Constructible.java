package monopolymedev;


/* La classe constructible représente les cases que le joueur peut acheter et sur lesquelles
 * il peut construire des maisons et des hôtels. Elle correspond à une case en couleur du monopoly réel.
*/

public class Constructible extends Achetable{
    
    //-----------------------------------------------------
    //----------------------Attributs----------------------
    //-----------------------------------------------------
    
    /**
     * Le nombre d'hôtels construits dans l'instance en cours.
     */
    private int nbHotels;
    
    /**
     * Le nombres de maisons construites dans l'instance en cours.
     */
    private int nbMaisons;
    
    
    //---------------------------------------------------------
    //----------------------Constructeurs----------------------
    //---------------------------------------------------------
    
    /**
     * Le constructeur général.
     */
    public Constructible(int prix, String nom, Joueur proprietaire, int loyer) {
        super(nom, prix, proprietaire, loyer);
        nbHotels = 0;
        nbMaisons = 0;
    }
    
    /**
     * Un constructeur sans attribut propriétaire pour l'initialisation du plateau.
     */
    public Constructible(int prix, String nom, int loyer) {
        super(nom, prix, loyer);
        nbHotels = 0;
        nbMaisons = 0;
    }
    
    
    
    //----------------------------------------------------
    //----------------------Méthodes----------------------
    //----------------------------------------------------
    
    /**
     * Retourne le loyer total en fonction du loyer de base et du nombre de constructions présentes sur la case.
     * Une maison augmente le loyer de 20%, un hôtel de 100%.
     * @param joueurCourant Représente le joueur qui vient de lancer les dés. Ce paramètre est inutile ici.
     */
    public int calculLoyer(Joueur joueurCourant) {
        return loyer*(1+(0.2*nbMaisons + nbHotels));
    }
    
    /**
     * Affiche dans la console les informations concernant l'instance en cours.
     */
    public void toString() {
        System.out.println("Case constructible " +nom+ ", possédée par " +proprietaire.getNom()+ ". Le prix d'achat est " +prix
                           + "€ et le loyer de base " +loyer+ "€. Il y a " +nbMaisons+ " maisons et "+ nbHotels
                           + " construits, pour un loyer total de " +calculLoyer()+ "€.");
    }
    
    
    //--------------------------------------------------------------
    //----------------------Getters et setters----------------------
    //--------------------------------------------------------------
    
    public int getNbHotels() {
        return nbHotels;
    }
    
    public void setNbHotels(int nbHotels) {
        this.nbHotels = nbHotels;
    }
    
    public int getNbMaisons() {
        return nbMaisons;
    }
    
    public void setNbMaisons() {
        this.nbMaisons = nbMaisons;
    }
}
