

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)



import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: \n");
        int n = scanner.nextInt();
        int sum = 0;
        int mult = 1;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            mult = mult * i;
            scanner.close();
        }
        System.out.println("Сумма n натуральных чисел: " + sum);
        System.out.println("Произведение n натуральных чисел: " + mult);
    }
}



// Числа Фибоначчи    - для себя

// import java.util.Scanner;
// public class hw1 {
// /**
//  * @param args
//  */
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите число n: ");
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
//         arr[0] = 0;
//         arr[1] = 1;
//         for (int i = 2; i < arr.length; i++) {
//         arr[i] = arr[i - 1] + arr[i - 2];
//         System.out.println(arr[i]);
//           }
// }
// }






// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 
// Введите число 2 2 + 2 = 4

// import java.util.Scanner;
// public class hw1{
//     public static void main(String[] args) {
//         double num1;
//         double num2;
//         double res;
//         char op;
//         Scanner reader = new Scanner(System.in);
//         System.out.print("Введите два числа: ");
//         num1 = reader.nextDouble();
//         num2 = reader.nextDouble();
//         System.out.print("\nВведите действие (+, -, *, /): ");
//         op = reader.next().charAt(0);
//         switch(op) {                                                            //Сравниваем переменную со списком значений
//            case '+': res = num1 + num2;
//               break;
//            case '-': res = num1 - num2;
//               break;
//            case '*': res = num1 * num2;
//               break;
//            case '/': res = num1 / num2;
//               break;
//            default:  System.out.printf("Ошибка, введите верное действие");
//               return;
//         }
//         System.out.print("\nОтвет:\n");
//         System.out.printf(num1 + " " + op + " " + num2 + " = " + "%.2f",res);     //%.2f - 2 знака после запятой
//      }
//   }