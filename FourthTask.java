import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fråga användare hur många Freddy Kreuger har dödat
        // Spara antalet
        // Fråga användare hur många Micheal Meyer har dödat
        // Spara antalet
        // Skapa en variabel som subtraherar Michael från Freddy
        // Skriv ut variabel

        System.out.println("Hur många har Freddy Krueger dödat?");
        int freddyKills = input.nextInt();

        System.out.println("Hur många har Michael Meyer dödat?");
        int michaelKills = input.nextInt();

        int differ = michaelKills - freddyKills;

        System.out.println("Det skiljer med " + differ + " offer");
    }
}
