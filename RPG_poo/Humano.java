package pooFinalWork;

public abstract class Humano extends Personagem{
    protected int inteligencia;
    protected int velocidade;
    protected int equipamentos;
    
    public Humano(int inteligencia, int velocidade, int equipamentos){
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.equipamentos = equipamentos;
    }
    public int getInteligencia() {
        return this.inteligencia;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getEquipamentos() {
        return this.equipamentos;
    }

    @Override
    public String toString() {
        return  "vida = " + super.vida + ", inteligencia = " + this.inteligencia + ", velocidade = " + this.velocidade + ", equipamentos = " + this.equipamentos;
    }
    
    
}
