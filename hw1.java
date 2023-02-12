// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: \n");
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма n натуральных чисел: " + sum);
    }
}