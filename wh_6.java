
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class wh_6 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addNumber("Татьяна Казеко", "56789", bookPhone);
        addNumber("Татьяна Казеко", "987698", bookPhone);
        addNumber("Максим Казеко", "23568956", bookPhone);
        addNumber("Андрей Казеко", "89076", bookPhone);
        addNumber("Владимир Троцкий", "12345678", bookPhone);
        addNumber("Владимир Троцкий", "987654", bookPhone);
        printBook(bookPhone);
        
    }
      public static <string> void addNumber(String key, string value, Map<String, ArrayList<String>> map) {
        if (map.containsKey(key)) {
            map.get(key).add((String) value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add((String) value);
            map.put(key, list);
            
        }
    }
    public static void printBook(Map<String, ArrayList<String>> bookPhone) {
        for (var item : bookPhone.entrySet()) {
            String phones = " ";
            for (String el : item.getValue()) {
                phones = phones + el + " ";
            }
            
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
    
   



       
    
  

