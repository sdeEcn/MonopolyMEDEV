/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonopolyMEDEV;

/**
 * case prison
 * @author spectre x360
 */
public class Prison extends NonAchetable{
     /**
     * Attribut:
     * @param prixSortie montant fixe à payer pour pouvoir sortir
     */
    private int prixSortie;
     
    /**constructeur
     * @param prix prix de sortie
     */
    public Prison(int prix) {
            this.prixSortie=prix;
            }
    /**constructeur de recopie
     * @param p prison à copier
     */
    public Prison(Prison p){
    this.prixSortie=p.getPrixSortie();
    }
    /**constructeur par défaut
     */
      public Prison() {
            this.prixSortie=0;
            }
    
    //getter / setter
      public void setPrixSortie(int p){
      this.prixSortie=p;
      }
      public int getPrixSortie(){
       return this.prixSortie;   
      }
      
      
      /*methode pour payer la caution
      
     *
      */
  
}
