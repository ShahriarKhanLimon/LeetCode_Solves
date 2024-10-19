import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B {
    
    private static boolean isValidK(int[] rungs, int k) {
        for (int i = 0; i < rungs.length; i++) {
            int jump = (i == 0) ? rungs[i] : rungs[i] - rungs[i - 1];
            if (jump > k) {
                return false; 
            } else if (jump == k) {
                k--; 
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  
        for (int t = 1; t <= T; t++) {
            int n = Integer.parseInt(br.readLine()); 
            int[] rungs = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                rungs[i] = Integer.parseInt(st.nextToken());
            }
            

            int low = 0;
            for (int i = 1; i < n; i++) {
                low = Math.max(low, rungs[i] - rungs[i - 1]);
            }
            low = Math.max(low, rungs[0]); 
            

            int high = rungs[n - 1] + 1;
            int result = high;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (isValidK(rungs, mid)) {
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
                        System.out.println("Case " + t + ": " + result);
        }
    }
}
