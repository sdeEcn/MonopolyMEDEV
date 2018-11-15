/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

public class Gare extends Achetable{
    
    		
	//-----------------------------------------------
	//-----------------Constructeurs-----------------
	//-----------------------------------------------

    /**
     * Le constructeur de recopie
     */
    
    public Gare(){
    super();}
    /**
     * Le constructeur de recopie
     */
    public Gare(int prix, String nom, Joueur proprietaire, int loyer){
        super(prix,nom,proprietaire,loyer);
    }
    
    /**
     * Le constructeur de recopie
     */
    public Gare(Gare g){
    this(g.prix,g.nom,g.proprietaire,g.loyer);}
    
   	//-----------------------------------------------
	//-----------------Methode-----------------
	//----------------------------------------------- 
    
    public int calculLoyer(){
    return proprietaire.nbGares()*2500;}
}

}
