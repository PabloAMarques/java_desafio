import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Definir o local para usar o ponto como separador decimal
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = (int) (value / note);
            System.out.printf("%d nota(s) de R$ %.2f\n", count, (double) note);
            value %= note;
        }

        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) (value / coin);
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin);
            value %= coin;
        }

        scanner.close();
    }
}
