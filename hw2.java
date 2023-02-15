// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

// import java.util.HashMap;
// import java.util.Map;
// public class hw2 {
//     public static void main(String[] args) {
//         Map<String, String> params1 = new HashMap<String,String>();
//         params1.put("name","Ivanov");
//         params1.put("country","Russia");
//         params1.put("city","Moscow");
//         params1.put("age",null);
//         System.out.println(getQuery(params1));
//         }
//     public static String getQuery(Map<String, String> params)
//         {
//         StringBuilder s = new StringBuilder();
//         for (Map.Entry<String,String> pair : params.entrySet())
//         {
//             if (pair.getValue() != null)
//                 {
//                     s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
//                 }
//             }
//             s.delete(s.toString().length()-5,s.toString().length());
//             return s.toString();
//         }

//     }





// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

// import java.util.Arrays;
// public class hw2 {
//     public static void main(String[] args) {
//         int[] arr = { 11, 3, 14, 16, 7, 8, 202, -11, 9, 1, 145 };

//         boolean isSorted = false;
//         int buf;
//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < arr.length - 1; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     isSorted = false;

//                     buf = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = buf;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }




// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.




// оставим на потом
