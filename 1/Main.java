import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("Digite os numeros um por linha. Pressione Enter sem digitar nada para iniciar a ordenacao:");

        List<Integer> values = new ArrayList<>();

        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int value = Integer.parseInt(input);
            values.add(value);
        }

        Collections.sort(values, new CustomComparator());

        System.out.println("\nNumeros ordenados:");
        for (int value : values) {
            System.out.println(value);
        }

        scanner.close();
    }

    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a % 2 == 0 && b % 2 == 0) {
                return a.compareTo(b);
            } else if (a % 2 == 0) {
                return -1;
            } else if (b % 2 == 0) {
                return 1;
            } else {
                return b.compareTo(a);
            }
        }
    }
}
