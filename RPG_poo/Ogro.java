package pooFinalWork;

public class Ogro extends Orc{
        
    public Ogro(){
        super(60, 60, 20);
    }
    
    @Override
    public String toString() {
        return "Ogro " + super.toString() + '|';
    }
    
}
