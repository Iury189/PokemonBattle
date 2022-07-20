package pokemonbattle;
import java.util.Random;

public class Battle {
    
    Pikachu pikachu = new Pikachu();
    Alakazam alakazam = new Alakazam();
    Random random = new Random();
    
    public void basePokemons(){
       pikachu.setStatsPikachu();
       pikachu.pikachuBaseStats();
       System.out.println("");
       alakazam.setStatsAlakazam();
       alakazam.alakazamBaseStats();
       System.out.println("");
    }
    // Pikachu VS Alakazan. Who will win?
    public void statusBattle(){
        int winner = random.nextInt(2) + 1;
        switch(winner){
            // Pikachu win, Alakam lost
            case 1:
                pikachu.win = true;
                alakazam.ko = true;
                pikachu.pikachuWinner();
                alakazam.alakazamDefeated();
                break;
            // Alakazan wim, Pikachu lost
            case 2:
                alakazam.win = true;
                pikachu.ko = true;
                alakazam.alakazamWinner();
                pikachu.pikachuDefeated();
                break;
        }
    }
    
}