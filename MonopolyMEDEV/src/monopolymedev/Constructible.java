public class Constructible extends Achetable{
    
    //-----------------------------------------------------
    //----------------------Attributs----------------------
    //-----------------------------------------------------
    
    /**
     *Le nombre d'hôtels construits dans l'instance en cours
     */
    private int nbHotels;
    
    /**
     *Le nombres de maisons construites dans l'instance en cours
     */
    private int nbMaisons;
    
    
    //---------------------------------------------------------
    //----------------------Constructeurs----------------------
    //---------------------------------------------------------
    
    /**
     *Le constructeur global
     */
    public Constructible(int prix, String nom, Joueur proprietaire, int loyer, int position) {
        super(nom, position, prix, proprietaire, loyer);
        nbHotels = 0;
        nbMaisons = 0;
    }
    
    /**
     *Le constructeur de recopie
     */
    public Constructible(Constructible c) {
        this(c.prix, c.nom, c.proprietaire, c.loyer, c.position);
        nbHotels = 0;
        nbMaisons = 0;
    }
    
    /**
     *Le constructeur par défaut
     */
    public Constructible() {
        super();
        nbHotels = 0;
        nbMaisons = 0;
    }
    
    
    //----------------------------------------------------
    //----------------------Méthodes----------------------
    //----------------------------------------------------
    
    /**
     *Retourne le loyer total en fonction du loyer de base et du nombre de constructions présentes sur la case.
     *Une maison augmente le loyer de 20%, un hôtel de 100%.
     */
    public int calculLoyer() {
        return super.loyer*(1+(0.2*nbMaisons + nbHotels));
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
