public class Solution_134 {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalGas = 0;
            int totalCost = 0;
            int tank = 0;
            int startStation = 0;

            for (int i = 0; i < gas.length; i++) {
                totalGas += gas [i];
                totalCost += cost[i];
                tank += gas[i] - cost[i];

                if (tank < 0) {
                    startStation = i + 1;
                    tank = 0;
                }
            }

            return totalGas < totalCost ? -1 : startStation;
        }

    public static void main (String[] args){
        Solution_134 sol = new Solution_134();

        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        System.out.println("Starting station: " + sol.canCompleteCircuit(gas1, cost1)); //Output should be 3

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        System.out.println("Starting station: " + sol.canCompleteCircuit(gas2, cost2)); //Output should be -1
    }
}
