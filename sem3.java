// public class sem3 {
//     public static void main(String[] args) {
//         String s1 = "hello";
//         String s2 = "hello";
//         String s3 = s1;
// // char l = 'l';
//         String s4 = "h" + "e" + "l" + "l" + "o"; // "hello"
//         String s5 = new String ("hello");
//         String s6 = new String (new char[] { 'h', 'e', 'l', 'l', 'o' });

//         if (s5 == s6)
//             System.out.println("Равны как ссылки");
//         else
//             System.out.println("Не равны как ссылки");

//         if (s5.equals(s6))
//             System.out.println("Значения равны");
//         else
//             System.out.println("Значения не равны");
//     }
// }






import java.util.ArrayList;
import java.util.Random;

/*Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
*/
public class sem3{
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            collection.add(rnd.nextInt(0, 11));
            }
        System.out.println(collection);
        collection.sort(null);
        System.out.println(collection);
    }
}
    
