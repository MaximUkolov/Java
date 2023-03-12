import java.util.Arrays;

// Task 1

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class sem1 {
//     // Прописать сниппет "main"
//     public static void main(String[] args) {
//         // Прописать сниппет "sout"
//         System.out.println("Hello World");

//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.YYYY");
//         System.out.println(formatter.format(now));
//     }

// }

// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// public class sem1 {
//     public static void main(String[] args) {
//         System.out.println("Напишите имя");
//         Scanner sc = new Scanner(System.in, "cp866");   //"cp866" - для ввода и вывода на русском языке
//         String Name = sc.nextLine();
//         // System.out.println("Hello " + Name);
//         System.out.printf(String.format("Привет %s! \n", Name));
//         // System.out.println(String.format("Привет %s!", Name));
//         sc.close();

//     }
// }

// Task 2

// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

// public class sem1 {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         int[] arr = new int[] {
//                 1, 1, 1, 1, 1, 0, 1, 1, 1
//         };
//         int max_lenght = 0;
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 1) {
//                 count++;
//             } else {
//                 if (count > max_lenght) {
//                     max_lenght = count;
//                 }
//                 count = 0;
//             }
//         }
//         if (count > max_lenght) {
//             max_lenght = count;
//         }
//         System.out.println(max_lenght);
//     }

// }

// *Task 3*

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов 
// массива должны быть отличны от заданного, а остальные - равны ему.

public class sem1 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3, 3, 2, 2, 2, 3, 3, 2, 3};
        int val = 3;
        int pos = arr.length - 1;
        for (int i = 0; i < pos; i++) {
            if (arr[i] == val) {
                while (arr[pos] == 3 && pos > i){
                    pos--;
                }
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}













