import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public float readNextFloat() {
        float nextFloat;
        try {
            System.out.println("Podaj kwote netto:");
            nextFloat = scanner.nextFloat();
        } catch (InputMismatchException e) {
            String next = scanner.next();
            System.out.println("To nie jest liczba: " + next + ". Podaj wartość liczbową!");
            return readNextFloat();
        }
        return nextFloat;
    }

    public void scannerClose() {
        scanner.close();
    }

    public VAT askForVat() {
        System.out.println("Wybierz wartość VAT: \n" +
                "a) VAT 23% \n" +
                "b) VAT 8% \n" +
                "c) VAT 5%");
        String vatChar = scanner.next();
        switch (vatChar) {
            case "a":
                return VAT.VAT23;
            case "b":
                return VAT.VAT8;
            case "c":
                return VAT.VAT5;
            default:
                scanner.nextLine();
                System.out.println("Błędna wartość. Wybierz a, b lub c.");
                return askForVat();
        }
    }
}