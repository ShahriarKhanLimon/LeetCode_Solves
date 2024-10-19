import java.util.*;
import java.io.*;

public class E {
    static List<Integer>[] adjList;
    static int[] shopAssignment;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int G = Integer.parseInt(st.nextToken());  // number of goods
        int S = Integer.parseInt(st.nextToken());  // number of sets
        int P = Integer.parseInt(st.nextToken());  // number of secret shops

        List<Set<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < S; i++) {
            st = new StringTokenizer(br.readLine());
            int numGoods = Integer.parseInt(st.nextToken());
            Set<Integer> goods = new HashSet<>();
            for (int j = 0; j < numGoods; j++) {
                goods.add(Integer.parseInt(st.nextToken()));
            }
            sets.add(goods);
        }

        // Build the similarity graph
        adjList = new List[S];
        for (int i = 0; i < S; i++) adjList[i] = new ArrayList<>();

        for (int i = 0; i < S; i++) {
            for (int j = i + 1; j < S; j++) {
                if (areSimilar(sets.get(i), sets.get(j))) {
                    adjList[i].add(j);
                    adjList[j].add(i);
                }
            }
        }

        // Try to color the graph using at most P colors (shops)
        shopAssignment = new int[S];
        Arrays.fill(shopAssignment, -1);

        boolean canAssign = true;
        for (int i = 0; i < S && canAssign; i++) {
            if (shopAssignment[i] == -1) {
                canAssign &= dfs(i, 0, P);
            }
        }

        if (canAssign) {
            System.out.println("YES");
            for (int i = 0; i < S; i++) {
                System.out.println(shopAssignment[i] + 1); // Output shop numbers (1-based)
            }
        } else {
            System.out.println("NO");
        }
    }

    // DFS to assign shops using P colors
    private static boolean dfs(int node, int color, int P) {
        shopAssignment[node] = color;
        for (int neighbor : adjList[node]) {
            if (shopAssignment[neighbor] == -1) {
                if (!dfs(neighbor, (color + 1) % P, P)) {
                    return false;
                }
            } else if (shopAssignment[neighbor] == shopAssignment[node]) {
                return false;
            }
        }
        return true;
    }

    // Check if two sets are similar based on the problem description
    private static boolean areSimilar(Set<Integer> setA, Set<Integer> setB) {
        if (setA.size() == setB.size()) {
            // Check if exactly one item can be replaced
            int diffCount = 0;
            for (int item : setA) {
                if (!setB.contains(item)) {
                    diffCount++;
                }
            }
            return diffCount == 1;
        } else if (Math.abs(setA.size() - setB.size()) == 1) {
            // Check if one item can be removed/added
            Set<Integer> larger = setA.size() > setB.size() ? setA : setB;
            Set<Integer> smaller = setA.size() > setB.size() ? setB : setA;
            return larger.containsAll(smaller);
        }
        return false;
    }
}
