// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// // Дано четное число N (>0) и символы c1 и c2. 
// // Написать метод, который вернет строку длины N, которая состоит из 
// // чередующихся символов c1 и c2, начиная с c1.

// public class sem2 {
//     public static void main(String[] args) {
//         char c1 = 'a';
//         char c2 = 't';
//         int num = 20;
//         System.out.println(createAlterraitingString (c1, c2, num));
//     }
//     private static String createAlterraitingString (char c1, char c2, int num){
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < num; i++) {
//             if (i % 2 == 0) result.append(c1);
//             else result.append(c2);

//         }
//         return result.toString();
//     }
// }

// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение).

// 

// Напишите метод, который составит строку, состоящую из 100 повторений 
// слова TEST и метод, который запишет эту строку в простой текстовый файл, 
// обработайте исключения.

// public class sem2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введите слово: \n");
//         String text = sc.nextLine();
//         writeString(repeatString(text));
//         sc.close();
//     }

//     private static String repeatString(String part) {
//         StringBuilder fullMaker = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             fullMaker.append(part);
//         }
//         return fullMaker.toString();
//     }

//     private static void writeString(String string) {
//         FileWriter file = null;
//         try {
//             file = new FileWriter("test.txt");
//             file.append(string);
//             System.out.println("Файл создан");

//         } catch (IOException ex) {
//             System.err.println("Error " + ex);
//         } finally {
//             if (file != null) {
//                 try {
//                     file.close();
//                 } catch (IOException ex) {
//                     System.err.println("Error " + ex);
//                 }
//             }
//         }

//     }
// }



// Напишите метод, который определит тип (расширение) 
// файлов из текущей папки и выведет в консоль результат вида
// 			1 Расширение файла: txt
// 			2 Расширение файла: pdf
// 			3 Расширение файла: 
// 			4 Расширение файла: jpg




public class sem2 {
    public static void main(String[] args) {
        
    }
}


