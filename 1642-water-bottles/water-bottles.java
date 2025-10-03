class Solution {
   public int numWaterBottles(int numBottles, int numExchange) {
    int total = numBottles;
    int empty = numBottles;

    while (empty >= numExchange) {
        int newFull = empty / numExchange;       // how many new full bottles you can get
        total += newFull;                        // drink them too
        empty = (empty % numExchange) + newFull; // leftover empties + new empties
    }

    return total;
}

}