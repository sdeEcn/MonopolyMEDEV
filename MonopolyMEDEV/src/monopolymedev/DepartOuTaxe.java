/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;


/**
 *
 * @author Lucas Deswarte
 */
public class DepartOuTaxe extends NonAchetable  {
    int gain;

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }
/**
     * Constructeur de DepartOuTaxe
     * @param nom nom de la nouvelle case
     * @param position position de la nouvelle case
     * @param gain ce que l'on gagne en tombant sur la case
     */
    public DepartOuTaxe(String nom, int position,int gain) {
        super(nom,position);
        this.gain = gain;
    }
    
    
    
}
