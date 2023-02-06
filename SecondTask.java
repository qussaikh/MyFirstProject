import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fråga användare om namn
        // Spara värdet i String variabel
        // Skriv ut värdet

        System.out.println("Hej, vad heter du?");
        String name = input.nextLine();

        System.out.println("Hej på dig, min gode vän " + name);
    }
}
