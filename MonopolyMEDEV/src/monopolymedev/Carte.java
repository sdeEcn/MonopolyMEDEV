/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolymedev;

/**
 *
 * @author Mael Guillossou
 */

public abstract class Carte extends NonAchetable {

    public Carte() {
        super();
    }
    
    public abstract void piocher(Joueur j);
    
}
