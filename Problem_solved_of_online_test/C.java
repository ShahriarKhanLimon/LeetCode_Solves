import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> dictionary = new TreeMap<>();
        
        int operationsCount = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < operationsCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            int operation = Integer.parseInt(input[0]);
            
            switch (operation) {
                case 0: // Insert operation
                    String key = input[1];
                    int value = Integer.parseInt(input[2]);
                    dictionary.put(key, value);
                    break;
                    
                case 1: // Get operation
                    key = input[1];
                    System.out.println(dictionary.getOrDefault(key, 0));
                    break;
                    
                case 2: // Delete operation
                    key = input[1];
                    dictionary.remove(key);
                    break;
                    
                case 3: // Dump operation
                    String L = input[1];
                    String R = input[2];
                    Map<String, Integer> subMap = dictionary.subMap(L, true, R, true);
                    for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                    break;
            }
        }
        
        scanner.close();
    }
}
