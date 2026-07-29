import java.util.Random;

public class rps {

    public static void main (String args[]) {


        Random rando = new Random(); // Class for random
        int roll = rando.nextInt(0, 4); // random int from 0 - 3;


        if (roll == 1){
            System.out.println("ROCK!");
        }
        if (roll == 2) {
            System.out.println("Paper!!!");
        }
        if (roll == 3) {
            System.out.println("Scissors!!!");
        } else {
            System.out.print("Item not found.");
        }
    }
}