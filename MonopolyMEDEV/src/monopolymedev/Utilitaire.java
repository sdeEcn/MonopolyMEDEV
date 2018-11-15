/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * constructeur avec paramètre
     * @param nom nom de la case
     * @param p prix de la case
     * @param pro propriétaire de la case
     * @param l loyer
     */
    public Utilitaire(String nom, int p, Joueur pro, int l){
        super(nom,p,pro,l);
    }

    
    //méthodes

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
}
