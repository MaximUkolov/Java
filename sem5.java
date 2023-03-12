// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.List;
// import java.util.Random;
// import java.util.Set;
// import java.util.TreeSet;

// /**
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//  */
// // public class sem5 {
// //     public static void main(String[] args) {
// //         Set<Integer> hashSet = new HashSet<>(List.of (400, 500, 600, 100, 200, 300));
// //         System.out.println(hashSet);

// //         Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
// //         System.out.println(linkedHashSet);

// //         Set<Integer> treeSet = new TreeSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
// //         System.out.println(treeSet);
// //     }
// // }



// // 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// // 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент 
// // уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// // Для вычисления процента используйте формулу:
// // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.



// // public class sem5 {

// //     public static void main(String[] args) {
// //         int[] array = new int[1000];
// //         Random rand = new Random();
// //         for (int i = 0; i < array.length; i++) {
// //             array[i] = rand.nextInt(25);
// //         }
// //         System.out.println(calcPercent(array));
// //     }

// //     private static float calcPercent(int[] array) {
// //         Set<Integer> uniq = new HashSet<>();
// //         for (int i = 0; i < array.length; i++) {
// //             uniq.add(array[i]);
// //         }
// //         return uniq.size() * 100f / array.length;
// //     }
// // }




// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.


