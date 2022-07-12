package pokemonbattle;

public class Alakazam {
    
    private String type = "Psychic";
    private int hp = 55;
    private int attack = 50;
    private int defense = 45;
    private int special_attack = 135;
    private int special_defense = 95;
    private int speed = 120;
    private boolean ko = false;
    private boolean win = false;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getHp() { return hp; }

    public void setHp(int hp) { this.hp = hp; }

    public int getAttack() { return attack; }

    public void setAttack(int attack) { this.attack = attack; }

    public int getDefense() { return defense; }

    public void setDefense(int defense) { this.defense = defense; }

    public int getSpecial_attack() { return special_attack; }

    public void setSpecial_attack(int special_attack) { this.special_attack = special_attack; }

    public int getSpecial_defense() { return special_defense; }

    public void setSpecial_defense(int special_defense) { this.special_defense = special_defense; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isKo() { return ko; }

    public void setKo(boolean ko) { this.ko = ko; }
    
    public boolean isWin() { return win; }

    public void setWin(boolean win) { this.win = win; }
    // Alakazam presentation attributes
    public void alakazamBaseStats(){
        int total = this.getHp() + this.getAttack() + this.getDefense() +
        this.getSpecial_attack() + this.getSpecial_defense() + this.getSpeed();
        System.out.println("Name: Alakazam");
        System.out.println("Type: " + this.getType());
        System.out.println("Attack: " + this.getAttack());
        System.out.println("Defense: " + this.getDefense());
        System.out.println("Special Attack: " + this.getSpecial_attack());
        System.out.println("Special Defense: " + this.getSpecial_defense());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Total: " + total);
    }
    // Alakazan win
    public void alakazamWinner(){
        if (this.isWin() != false){
           System.out.println("Alakazam winner!");
        }
    }
    // Alakazan lost
    public void alakazamDefeated(){
        if (this.isKo() != false){
           System.out.println("Alakazam defeated.");
        }
    } 
}