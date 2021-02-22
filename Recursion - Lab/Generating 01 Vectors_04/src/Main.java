import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        generateBinaryNumbers(array, 0);
    }

    private static void generateBinaryNumbers(int[] array, int index) {
        if (index > array.length - 1){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i <= 1; i++) {
            array[index] = i;
            generateBinaryNumbers(array, index + 1);
        }
    }
}
