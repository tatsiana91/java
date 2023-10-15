
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class wh_6 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Татьяна Казеко", 56789, bookPhone);
        addNumber("Татьяна Казеко", 987698, bookPhone);
        addNumber("Максим Казеко", 23568956, bookPhone);
        addNumber("Андрей Казеко", 89076, bookPhone);
        addNumber("Владимир Троцкий", 12345678, bookPhone);
        addNumber("Владимир Троцкий", 987654, bookPhone);
        printBook(bookPhone);
        
    }
      public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
            
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = " ";
            for (int el : item.getValue()) {
                phones = phones + el + " ";
            }
            
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
    
   



       
    
  

