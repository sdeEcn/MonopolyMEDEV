package monopolymedev;

/**
 * classe utilitaire, sous classe de Achetable (correspond aux cases électricité et eau)
 * 
 * @author Elise
 */
public class Utilitaire extends Achetable {
    //constructeurs

    /**
     * constructeur par défaut
     */
    public Utilitaire(){
        super();
    }

    /**
     * constructeur avec paramètre, on fixe le loyer à 0 car il n'a pas de sens pour ce type de case
     * @param nom nom de la case
     * @param p prix de la case
     * @param pro propriétaire de la case
     */
    public Utilitaire(String nom, int p, Joueur pro){
        super(nom,p,pro,0);
    }

    
    //méthodes

    @Override
    public int calculLoyer(){
        return 0;
    }
    /**
     * calcule le loyer que doit payer le joueur au propriétaire de la case
     * @param j joueur
     * @return loyer
     */
    public int calculLoyer(Joueur j){
        int d = j.dernierLancer;
        int n;
        int l;
        //on calcule le loyer en fonction du nombre de cases utilitaire du propriétaire de la case
        n=this.proprietaire.nbUtilitaire();
        if (n==1){
            l=d*4;
        }else{
            l=d*10;
        }
        return l;
    }  
    
   
    
    @Override
    public String toString(){
        return "Nom de la case : "+nom+" ; prix de la case : "+prix+" ; propriétaire de la case : "+this.proprietaire.nom;
    }
}
