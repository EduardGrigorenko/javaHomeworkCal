import java.util.Scanner;

public class namberDecompositionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x1 = number / 100;
        int x2 = (number / 10) % 10;
        int x3 = number % 10;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
