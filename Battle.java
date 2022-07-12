package pokemonbattle;
import java.util.Random;

public class Battle {
    
    Pikachu pikachu = new Pikachu();
    Alakazam alakazam = new Alakazam();
    Random random = new Random();
    // Pokemons presentation
    public void basePokemons(){
       pikachu.pikachuBaseStats();
       System.out.println("");
       alakazam.alakazamBaseStats();
       System.out.println("");
    }
    // Pikachu VS Alakazan. Who will win?
    public void statusBattle(){
        int winner = random.nextInt(2) + 1;
        switch(winner){
            // Pikachu win, Alakam lost
            case 1:
                pikachu.setWin(true);
                alakazam.setKo(true);
                pikachu.pikachuWinner();
                alakazam.alakazamDefeated();
                break;
            // Alakazan wim, Pikachu lost
            case 2:
                alakazam.setWin(true);
                pikachu.setKo(true);
                alakazam.alakazamWinner();
                pikachu.pikachuDefeated();
                break;
        }
    }
}