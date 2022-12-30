package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu kí tự = ");
        String xauKT = scanner.nextLine();

        String[] strArr = xauKT.split("\\s",0);
        Map<String, Integer> map = new HashMap<>();
        for(String strArr1:strArr){
            if(map.containsKey(strArr1)){
                Integer value = map.get(strArr1);
                value++;
                map.replace(strArr1, value);
            }else {
                map.put(strArr1, 1);
            }
        }
        System.out.println(map.toString());
    }
}
