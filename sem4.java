// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Scanner;

// public class sem4 {
//     public static void main(String[] args) {
//         long time = System.currentTimeMillis();

//         ArrayList<Integer> integerArrayList = new ArrayList<>();
//         for (int i = 0; i < 10000; i++) {
//             integerArrayList.add((int) (Math.random() * 100));
//         }
//         System.out.println("Заполнение ArrayList заняло " + (System.currentTimeMillis() - time));

//         time = System.currentTimeMillis();

//         LinkedList<Integer> integerLinkedList = new LinkedList<>();
//         for (int i = 0; i < 10000; i++) {
//             integerLinkedList.add((int) (Math.random() * 100));
//         }
//         System.out.println("Заполнение LinkedList заняло " + (System.currentTimeMillis() - time));
//     }
// }




// Задача 1



    // public class sem4 {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Введите строку вида text~num: ");
    //         String str = sc.nextLine();
    //         String[] splt = str.split("~");
    //         LinkedList<String> list = new LinkedList<>();
    //         int num = Integer.parseInt(splt[1]);
    //         while (!splt[0].equals("q")) {
    //             num = Integer.parseInt(splt[1]);
    //             if (splt[0].equals("print") && list.size() > num) {
    //                 System.out.println(list.get(Integer.parseInt(splt[1])));
    //                 list.remove(Integer.parseInt(splt[1]));
    //             } else {
    //                 list.add(num, splt[0]);
    //             }
    //             System.out.println("Введите строку вида text~num: ");
    //             str = sc.nextLine();
    //             splt = str.split("~");
    //         }
    //         sc.close();
    //     }
    // }




