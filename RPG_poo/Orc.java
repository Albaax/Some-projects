package pooFinalWork;

public abstract class Orc extends Personagem {
    protected int força;
    protected int habilidade;
    protected int agilidade;
    
    public Orc(int força, int habilidade, int agilidade){
        this.força = força;
        this.habilidade = habilidade;
        this.agilidade = agilidade;
    }
    
    public int getForça() {
        return this.força;
    }

    public int getHabilidade() {
        return this.habilidade;
    }

    public int getAgilidade() {
        return this.agilidade;
    }

    @Override
    public String toString() {
        return "vida = " + super.vida + ", força = " + this.força + ", habilidade = " + this.habilidade + ", agilidade = " + this.agilidade;
    }
    
    
}
