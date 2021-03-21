package pooFinalWork;

public class Robo extends Humano{
    
    public Robo() {
        super(80, 20, 60);
    }
    
    @Override
    public String toString() {
        return "Robo " + super.toString() + '|';
    }
    
    

}
