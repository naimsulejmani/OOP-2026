package introduction;

public class Pokemon {
    public String name;
    public String type;
    public int health;


    public boolean dodge() {
        return Math.random() > 0.5;
    }

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            --enemy.health;
        } else {
            IO.println("Pshtove per pak!");
        }
    }


}
