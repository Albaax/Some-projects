package pooFinalWork;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    public static void main(String args[]) {
    
    /* Declaration ArrayList */
    ArrayList <Orc> orc = new ArrayList<>();
    ArrayList <Humano> humano = new ArrayList<>();
    int vitoriasOrc = 0;
    int vitoriasHumano = 0;
    
    
    System.out.println("-------------------------GAME------------------------------");
    System.out.println("-- Batalha épica entre Orcs vs Humanos" +
                       "\n--------- Orcs ----------" + "\t----------- Humanos ---------" +
                       "\nOgro --- Mago --- Demonio" + "\tArqueiro --- Soldado --- Robô" +
                       "\n 60F      20F       80F  " + "\t  60I          20I        80I" +
                       "\n 60H      80H       20H  " + "\t  60V          80V        20V" +
                       "\n 20A      40A       60A  " + "\t  20E          40E        60E" );
    System.out.println("\nF: Força\tI: Inteligência\nH: Habilidade\tV: Velocidade\nA: Agilidade\tE : Equipamentos");
    
    /* Draw random classes in each position of the two different peoples */
    
        for (int i = 0; i < 100; i++){
            Random orcOptions = new Random();
            switch(orcOptions.nextInt(3)){
                case 0:
                    orc.add(new Ogro());
                    break;
                case 1:
                    orc.add(new Mago());
                    break;
                case 2:
                    orc.add(new Demonio());
                    break;
            }

            Random humanoOptions = new Random();
            switch(humanoOptions.nextInt(3)){
                case 0:
                    humano.add(new Arqueiro());
                    break;
                case 1:
                    humano.add(new Soldado());
                    break;
                case 2:
                    humano.add(new Robo());
                    break;               
            }   
        }

        System.out.println("Começa a partida!! (melhor de 100)\n");
        int vidaTotalOrc = 0;
        int vidaTotalHumano = 0;
        
        /* Loop that is the fight between orc and humans.
        Compare atributes of each class and define who is the winner(if exist).
        The class that wins the fight, receive an increase on its life(the difference between the powers).
        The class that loses the fight, receive a decrease on its life(the difference between the powers).
        The winner people receive a win, and the loser people receive a lose.
        In case of tie, the peoples are not affected.
        */
        
        for (int i = 0; i < 100; i++){
            
            int dif;
            Random confronto = new Random();
            System.out.print("COMBATE " + (i+1) + " entre " + orc.get(i).toString() + " vs ");
            System.out.println(humano.get(i).toString());
            switch(confronto.nextInt(3)){
                case 0: // Força vs Inteligência
                    if(orc.get(i).getForça() > humano.get(i).getInteligencia()){
                        dif = orc.get(i).getForça() - humano.get(i).getInteligencia();
                        orc.get(i).ganharVida(dif);
                        humano.get(i).perderVida(dif);
                        vitoriasOrc++;
                        System.out.println("VENCEDOR: " + orc.get(i).toString());
                        System.out.println("Perdedor: " + humano.get(i).toString());
                    }
                    else if(orc.get(i).getForça() < humano.get(i).getInteligencia()){
                        dif = humano.get(i).getInteligencia() - orc.get(i).getForça();
                        humano.get(i).ganharVida(dif);
                        orc.get(i).perderVida(dif);
                        vitoriasHumano++;
                        System.out.println("VENCEDOR: " + humano.get(i).toString());
                        System.out.println("Perdedor: " + orc.get(i).toString());
                    }
                    else{
                        System.out.println("Empate entre os povos durante o combate!");
                    }
                    break;
                    
                case 1: // Habilidade vs Velocidade
                    if(orc.get(i).getHabilidade() > humano.get(i).getVelocidade()){
                        dif = orc.get(i).getHabilidade() - humano.get(i).getVelocidade();
                        orc.get(i).ganharVida(dif);
                        humano.get(i).perderVida(dif);
                        vitoriasOrc++;
                        System.out.println("VENCEDOR: " + orc.get(i).toString());
                        System.out.println("Perdedor: " + humano.get(i).toString());
                    }
                    else if(orc.get(i).getHabilidade() < humano.get(i).getVelocidade()){
                        dif = humano.get(i).getVelocidade() - orc.get(i).getHabilidade();
                        humano.get(i).ganharVida(dif);
                        orc.get(i).perderVida(dif);
                        vitoriasHumano++;
                        System.out.println("VENCEDOR: " + humano.get(i).toString());
                        System.out.println("Perdedor: " + orc.get(i).toString());
                    }
                    else{
                        System.out.println("Empate entre os povos durante o combate!");
                    }
                    break;
                    
                case 2: // Agilidade vs Equipamentos
                    if(orc.get(i).getAgilidade() > humano.get(i).getEquipamentos()){
                        dif = orc.get(i).getAgilidade() - humano.get(i).getEquipamentos();
                        orc.get(i).ganharVida(dif);
                        humano.get(i).perderVida(dif);
                        vitoriasOrc++;
                        System.out.println("VENCEDOR: " + orc.get(i).toString());
                        System.out.println("Perdedor: " + humano.get(i).toString());
                    }
                    else if(orc.get(i).getAgilidade() < humano.get(i).getEquipamentos()){
                        dif = humano.get(i).getEquipamentos() - orc.get(i).getAgilidade();
                        humano.get(i).ganharVida(dif);
                        orc.get(i).perderVida(dif);
                        vitoriasHumano++;
                        System.out.println("VENCEDOR: " + humano.get(i).toString());
                        System.out.println("Perdedor: " + orc.get(i).toString());
                    }
                    else{
                        System.out.println("Empate entre os povos durante o combate!");
                    }
                    break;
                    
            }
            System.out.println("------*------");
            vidaTotalOrc += orc.get(i).getVida();
            vidaTotalHumano += humano.get(i).getVida();
        }
        
        System.out.println("\nFim da batalha!\n\nResultados(100 batalhas): ");
        
        /* Battle results */
        
        if(vitoriasOrc > vitoriasHumano){
            System.out.println("O povo vencedor foram os Orcs com " + vitoriasOrc + " vitórias\nSua vida total foi: " + vidaTotalOrc);
            System.out.println("A vida total dos derrotados Humanos foi: " + vidaTotalHumano + "\nNº vitórias: " + vitoriasHumano);
        }
        
        else if(vitoriasHumano > vitoriasOrc){
            System.out.println("O povo vencedor foram os Humanos com " + vitoriasHumano + " vitórias\nSua vida total foi: " + vidaTotalHumano);
            System.out.println("A vida total dos derrotados Orcs foi: " + vidaTotalOrc + "\nNº vitórias: " + vitoriasOrc);
        }
        
        else if(vitoriasHumano == vitoriasOrc){
            
            if(vidaTotalOrc > vidaTotalHumano){
                System.out.println("O povo vencedor foram os Orcs com " + vitoriasOrc + " vitórias\nSua vida total foi: " + vidaTotalOrc);
                System.out.println("A vida total dos derrotados Humanos foi: " + vidaTotalHumano + "\nNº vitórias: " + vitoriasHumano);
            }
            else if(vidaTotalHumano > vidaTotalOrc){
                System.out.println("O povo vencedor foram os Humanos com " + vitoriasHumano + " vitórias\nSua vida total foi: " + vidaTotalHumano);
                System.out.println("A vida total dos derrotados Orcs foi: " + vidaTotalOrc + "\nNº vitórias: " + vitoriasOrc);
            }
            else{
                System.out.println("Empate na Batalha!\nNº vitórias dos Orcs: " + vitoriasOrc + "\nVida total dos Orcs: " + vidaTotalOrc + 
                                    "\nNº vitórias dos Humanos: " + vitoriasHumano + "\nNº vitórias: " + vidaTotalHumano);
            }
        }
               
    }       
}