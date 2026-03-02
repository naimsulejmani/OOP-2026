package introduction;

public class PokemonDemo {
    static void main() {
        Pokemon pikachu = new Pokemon();
        //Pokemon pikachu1 = new Pokemon("pikachu",70,"Electric");
        pikachu.name = "Pikachu";
        pikachu.health = 70;
        pikachu.type = "Electric";

        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.health = 100;
        bulbasaur.type = "Grass";

        pikachu.attack(bulbasaur);
        bulbasaur.attack(pikachu);

        IO.println("Pikachu health: " + pikachu.health);
        IO.println("Bulbasaur health: " + bulbasaur.health);

    }
}
