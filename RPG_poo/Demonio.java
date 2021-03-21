package pooFinalWork;

public class Demonio extends Orc {
    
    public Demonio() {
        super(80, 20, 60);
    }   

    @Override
    public String toString() {
        return "Demonio " + super.toString() + '|';
    }
}
