package pooFinalWork;

public class Arqueiro extends Humano{
    
    public Arqueiro() {
        super(60, 60, 20);
    }
    
    @Override
    public String toString() {
        return "Arqueiro " + super.toString() + '|';
    }
    
}
