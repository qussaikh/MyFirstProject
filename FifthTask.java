import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fråga användare om input
        // Spara talet i en int
        // Fråga om input i int
        // Spara i en double
        // Skriv ut värdet
        //------------------------

        System.out.println("Hur många gånger sa Samuel L Jackson MF-ordet?");
        int mofo = input.nextInt();

        System.out.println("I hur många filmer?");
        int movies = input.nextInt();

        float averege = (float)mofo / movies;


        System.out.println("Samuel L Jackson säger i snitt MF-ordet " + averege + " gånger per film");
    }
}
