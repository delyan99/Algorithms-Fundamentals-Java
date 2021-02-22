import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        sumOfArrayWithRecursion(array, array.length);
        System.out.println(sum);
    }

    private static void sumOfArrayWithRecursion(int[] array, int index) {
        index -= 1;
        if(index == 0){
            sum += array[index];
            return;
        }
        sum += array[index];
        sumOfArrayWithRecursion(array, index);
    }
}
