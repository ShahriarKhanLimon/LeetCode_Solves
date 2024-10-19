import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> dictionary = new HashMap<>();
        
        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int command = Integer.parseInt(query[0]);
            
            switch (command) {
                case 0: 
                    String key = query[1];
                    int value = Integer.parseInt(query[2]);
                    dictionary.put(key, value);
                    break;
                    
                case 1:
                    key = query[1];
                    System.out.println(dictionary.getOrDefault(key, 0));
                    break;
                    
                case 2: 
                    key = query[1];
                    dictionary.remove(key);
                    break;
            }
        }

        scanner.close();
    }
}
