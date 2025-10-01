class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int counter = numBottles;
        int remainder = numBottles / numExchange;
        int remainder2 = numBottles % numExchange;
        int newTotal = remainder + remainder2;
        counter += remainder;

        while (newTotal >= numExchange) {
            counter += newTotal / numExchange;
            remainder = newTotal / numExchange;
            remainder2 = newTotal % numExchange;
            newTotal = remainder + remainder2;
        }
        // if (remainder2 + remainder >= numExchange) {
        //     counter += (remainder2 + remainder) / numExchange;
        // }
        // counter += remainder;
        
        // remainder /= numExchange;
        // while (remainder / numExchange >= 1) {
        //     remainder /= numExchange;
        //     counter += remainder;
        // }
        return counter;




    }
}