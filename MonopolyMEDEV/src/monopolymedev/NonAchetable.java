package monopolymedev;

/**
 * classe qui regroupe les cases non achetables
 * @author spectre x360
 */
public abstract class NonAchetable extends Case {
    
    public NonAchetable(){
    super();
    }
    public NonAchetable(NonAchetable c) {
        super(c);
    }
    public NonAchetable(String nom, int position) {
        super(nom,position);
    }
    
    
}
