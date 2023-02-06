import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fråga användare kalle hur många äpplen han har
        // Fråga användare Pelle hur många äpplen han har
        // Spara summa av kalle och pelle i variabel
        // Skriv ut summa

        System.out.println("Ungjävel Kalle, hur många äpplen har du pallat egentligen?");
        int kalle = input.nextInt();

        System.out.println("Ungjävel Pelle, hur många äpplen har du pallat egentligen?");
        int pelle = input.nextInt();

        int numberOfApples = kalle + pelle;

        System.out.println("Ungjävlarna har pallat " + numberOfApples + " äpplen tillsammans");


    }
}
