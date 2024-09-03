import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite uma string: ");
            String original = scanner.nextLine();

            String invertida = inverterString(original);
            System.out.println("String invertida: " + invertida);

            System.out.print("Deseja inverter outra string? (sim/não): ");
            resposta = scanner.nextLine().toLowerCase();
        } while (!resposta.equals("não"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static String inverterString(String s) {
        StringBuilder invertida = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida.append(s.charAt(i));
        }
        return invertida.toString();
    }
}

