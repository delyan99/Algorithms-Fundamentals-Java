import java.util.Scanner;

public class Main {
    private static int factorial = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int result = findFactorial(input);
        System.out.print(result);
    }

    private static int findFactorial(int number) {
        if(number == 1){
            factorial *= number;
            return factorial;
        }
        factorial *= number;
        number -= 1;
        return findFactorial(number);
    }
}
