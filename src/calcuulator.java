import java.util.Scanner;

public class calcuulator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double num1;
        double num2;
        double ans;
        char op;

        System.out.print(" Введите Два числа через Пробел : ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print(" \nВыбирите знак (+, -, *, /)");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("ERROR");
                return;
        }
        System.out.println("Ваш результат :" );
        System.out.printf(num1 + " " + op + " " + num2 + "=" + ans);
    }
}
