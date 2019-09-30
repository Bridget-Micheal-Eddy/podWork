package games;

public class GameTest {

    public static void main(String[] args) {
        Zelda zelda = new Zelda();

        Pokemon pokemon = new Pokemon();

        System.out.println("Zelda Breath of the Wild");
        System.out.println(zelda.getGenre());
        System.out.println(zelda.getMemory() + "GB");


        System.out.println("Pokemon Sword/Shield");
        System.out.println(pokemon.getGenre());
        System.out.println(pokemon.getMemory() + "GB");

    }
}
