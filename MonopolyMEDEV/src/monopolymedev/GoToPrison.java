package monopolymedev;

/**
 * Cette classe représente la case envoyant les joueurs en prison
 * @author Mathilde
 */
public class GoToPrison extends Pas_Achetable {
    
    public GoToPrison (){
        nom="Allez en prison";
        position=30;
    }
    
    /**
     * Methode pour afficher la prison
     */
    public void toString (){
        System.out.println("Allez en prison");
    }
}
