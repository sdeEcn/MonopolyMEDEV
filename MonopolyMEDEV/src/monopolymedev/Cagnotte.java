/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author Jorism
 */


public class Cagnotte extends NonAchetable{
    private int valeur;
    
    public Cagnotte (){
        super("Cagnotte");
        this.valeur = 2000;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    // affichage
   @override
public String toString(){
return ("cagnotte:" +this.getValeur());
}
    
}
