package pokemonbattle;

public class Pikachu extends Pokemon {
    
    public void setStatsPikachu() {
       this.type = "Electric";
       this.hp = 35;
       this.attack = 50;
       this.defense = 40;
       this.special_attack = 50;
       this.special_defense = 50;
       this.speed = 90;
       this.ko = false;
       this.win = false;
       this.total = this.hp + this.attack + this.defense +
       this.special_attack + this.special_defense + this.speed;
    }
    
    public void pikachuBaseStats(){
        System.out.println("Name: Pikachu");
        System.out.println("Type: " + this.type);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("Special Attack: " + this.special_attack);
        System.out.println("Special Defense: " + this.special_defense);
        System.out.println("Speed: " + this.speed);
        System.out.println("Total: " + this.total);
    }
    
    public void pikachuWinner(){
        if (this.win != false){
           System.out.println("Pikachu winner!");
        }
    }
    
    public void pikachuDefeated(){
        if (this.ko != false){
           System.out.println("Pikachu defeated.");
        }
    }
    
}