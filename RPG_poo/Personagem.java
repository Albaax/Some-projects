package pooFinalWork;

public abstract class Personagem {
    protected int vida = 100;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void ganharVida(int dif){
        setVida(getVida() + dif);
    }
    
    public void perderVida(int dif){
        setVida(getVida() - dif);
    }
}
