import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o valor alvo: ");
        int k = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        System.out.println("Digite os elementos do array separados por espacos:");
        String[] values = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println("Numero de pares com diferenca " + k + ": " + count);

        scanner.close();
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : arr) {
            int target = num + k;

            if (frequencyMap.containsKey(target)) {
                count++;
                frequencyMap.remove(target); // Remove o par encontrado para evitar contagem duplicada
            }
        }

        return count;
    }
}
