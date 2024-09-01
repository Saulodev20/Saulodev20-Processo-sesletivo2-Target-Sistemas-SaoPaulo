import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
}

