package pooFinalWork;

public class Mago extends Orc {

    public Mago() {
        super(20, 80, 40);
    }
    
    @Override
    public String toString() {
        return "Mago " + super.toString() + '|';
    }
        
}
