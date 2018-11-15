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

    /**
     * calcule le loyer que doit payer le joueur au propriétaire de la case
     * @param j joueur
     * @return loyer
     */
    @Override
    public int calculLoyer(Joueur j){
        int d = j.dernierLancer;
        int n;
        int l;
        //on calcule le loyer en fonction du nombre de cases utilitaire du propriétaire de la case
        n=nbUtilitaire(this.proprietaire);
        if (n==1){
            l=d*4;
        }else{
            l=d*10;
        }
        return l;
    }  
    
    /**
     * calcule le nombre de cases utilitaires que possède un joueur
     * @param j le joueur
     * @return le nombre de cases utilitaires
     */
    public int nbUtilitaire(Joueur j){
        int c=0;
        for(int i=0; i<j.proprietes.size();i++){
            if (j.proprietes.get(i) instanceof Utilitaire){
                c=c+1;
            }
        }
        return c;
    }
    
    @Override
    public String toString(){
        return "Nom de la case : "+nom+" ; prix de la case : "+prix+" ; propriétaire de la case : "+this.proprietaire.nom;
    }
}
