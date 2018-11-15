/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author Elise
 */
public class Utilitaire extends Achetable {
    //constructeurs
    public Utilitaire(){
        super();
    }
    public Utilitaire(int p, Joueur pro, int l){
        super(p,pro,l);
    }
    public Utilitaire(Utilitaire u){
        super(u);
    }
    
}
