package pokemonbattle;

public class Alakazam extends Pokemon {

    public void setStatsAlakazam() {
       this.type = "Psychic";
       this.hp = 55;
       this.attack = 50;
       this.defense = 45;
       this.special_attack = 135;
       this.special_defense = 95;
       this.speed = 120;
       this.ko = false;
       this.win = false;
       this.total = this.hp + this.attack + this.defense +
       this.special_attack + this.special_defense + this.speed;
    }
    
    public void alakazamBaseStats(){
        System.out.println("Name: Alakazam");
        System.out.println("Type: " + this.type);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("Special Attack: " + this.special_attack);
        System.out.println("Special Defense: " + this.special_defense);
        System.out.println("Speed: " + this.speed);
        System.out.println("Total: " + this.total);
    }
   
    public void alakazamWinner(){
        if (this.win != false){
           System.out.println("Alakazam winner!");
        }
    }
    
    public void alakazamDefeated(){
        if (this.ko != false){
           System.out.println("Alakazam defeated.");
        }
    }
    
}