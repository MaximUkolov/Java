

// Реализовать алгоритм сортировки слиянием.



// public class hw3 {
//     public static void main(String[] args) {
//         int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
//         int[] result = mergesort(array1);
//         System.out.println(Arrays.toString(result));
//     }
 
//     public static int[] mergesort(int[] array1) {
//         int[] buffer1 = Arrays.copyOf(array1, array1.length);
//         int[] buffer2 = new int[array1.length];
//         int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
//         return result;
//     }
//     public static int[] mergesortInner(int[] buffer1, int[] buffer2,
//             int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return buffer1;
//         }
        
//         // уже отсортирован.
//         int middle = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
//         int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        
//         // Слияние
//         int index1 = startIndex;
//         int index2 = middle;
//         int destIndex = startIndex;
//         int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
//         while (index1 < middle && index2 < endIndex) {
//             result[destIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++] : sorted2[index2++];
//         }
//         while (index1 < middle) {
//             result[destIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             result[destIndex++] = sorted2[index2++];
//         }
//         return result;
//     }
// }    



// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.



// import java.util.Arrays;
// import java.util.Random;
// import java.util.Scanner;
 
// public class hw3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         do {
//             System.out.print("Введите длинну массива (n >= 2): ");
//             n = sc.nextInt();
//         } while (n < 2);
//         int[] array = createRandomArray(n, 1, 9);
 
//         System.out.println("Дан массив: " + Arrays.toString(array));
 
//         int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length));
//         System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayDelete));
//     }
 
//     public static int[] createRandomArray(int length, int min, int max) {
//         int[] result = length > 0 ? new int[length] : new int[0];
//         if (length > 0) {
//             Random rand = new Random();
//             for (int index = 0; index < length; index++) {
//                 result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
//             }
//         }
//         return result;
//     }
 
//     public static int[] deleteEvenElement(int[] array) {
//         int i, j;
//         for (i = 0, j = 1; j < array.length; i++, j += 2) {
//             array[i] = array[j];
//         }
//         return Arrays.copyOf(array, i);
//     }
// }







// Задан целочисленный список Arrayarr. Найти минимальное, максимальное и среднее арифметичское этого списка.



public class hw3 {
    public static void main(String[] args) {
        int[] arr = new int[] {23, 54, 7, 32, 20, 4};

        int min = arr.length;
        int max = 0;
        double res = 0;

        for (Integer i: arr) {
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;
        }
                
        if (arr.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            res = sum / arr.length;
}

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("среднее арифметическое: " + Math.round(res));
        
    }
}


