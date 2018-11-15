package monopolymedev;

/**
 * classe utilitaire, sous classe de Achetable
 * 
 * @author Elise
 */
public class Utilitaire extends Achetable {
    //constructeurs

    /**
     * consstructeur par défaut
     */
    public Utilitaire(){
        super();
    }

    /**
     * constructeur avec paramètre
     * @param nom nom de la case
     * @param pos numéro de la caase sur le plateau
     * @param p prix de la case
     * @param pro propriétaire de la case
     * @param l loyer
     */
    public Utilitaire(String nom, int pos, int p, Joueur pro, int l){
        super(nom,pos,p,pro,l);
    }

    
    //méthodes

    /**
     * 
     */
    public void calculLoyer(){
        
    }  
}
