package pooFinalWork;

public class Soldado extends Humano{
    
    public Soldado() {
        super(20, 80, 40);
    }
    
    @Override
    public String toString() {
        return "Soldado " + super.toString() + '|';
    }
    
    
}
