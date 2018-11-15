package monopolymedev;

/**
 * Cette classe représente la case envoyant les joueurs en prison
 * @author Mathilde
 */
public class GoToPrison extends NonAchetable {
    
    /**
     * Constructeur par défaut de GoToPrison
     */
    public GoToPrison (){
        this.setNom("Allez en prison");
        this.setPosition(30);
    }
    
    /**
     * Methode pour afficher la prison
     */
    @Override
    public String toString (){
        return "Allez en prison";
    }
    
    /**
     * Méthode pour envoyer un joueur en prison
     */
    public static void envoyerPrison(Joueur j){
        System.out.println("Allez en prison! Vous ne passez pas par la case départ et ne touchez pas 60 0000€.");
        j.setPosition(10); //on envoie le joueur en prison
        j.setEtatPrison(3);
    }
}
