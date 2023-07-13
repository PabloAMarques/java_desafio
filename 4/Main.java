import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o inteiro n

        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a linha codificada: ");
            String line = scanner.nextLine();
            inputBuilder.append(line);
            inputBuilder.append(System.lineSeparator());
        }

        String input = inputBuilder.toString();
        String[] lines = input.split(System.lineSeparator());

        System.out.println("Resultado:");
        for (String line : lines) {
            String decodedLine = decodeLine(line);
            System.out.println(decodedLine);
        }

        scanner.close();
    }

    public static String decodeLine(String line) {
        int length = line.length();
        StringBuilder decodedLine = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            decodedLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            decodedLine.append(line.charAt(i));
        }

        return decodedLine.toString();
    }
}
