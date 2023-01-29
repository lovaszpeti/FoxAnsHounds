import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Felhasználó név bekérése, tárolása
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adjon meg egy felhasználónevet: ");
        String felhasznalonev = scanner.nextLine();
        System.out.println(felhasznalonev);
    }
}
