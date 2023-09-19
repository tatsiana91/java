// Создать ява приложение с точкой входа. Создать строку "Привет мир"  и вывести чётные символы.


// public class lesson1 {
//     public static void main(String[] args) {

//         String s1 = "ПРИВЕТ МИР";
//         for (int i = 0; i < s1.length(); i++) {
//             if (i %2 == 0) System.out.print(s1.charAt(i));
//             }
        
            
    
//     }
// }
// создать целочисленную переменную и записать в неё случайное число
// найти старший значищий бит бит случайного числа
import java.util.Random;

public class lesson1 {
     public static void main(String[] args) {
    // int number = new Random() .nextInt(1000);
    // System.out .println(number);
    System.out.println(Integer.toBinaryString(new Random() .nextInt(1000)).length());
     }
 }
