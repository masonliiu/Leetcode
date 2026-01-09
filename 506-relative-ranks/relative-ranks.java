class Solution {
    public String[] findRelativeRanks(int[] score) {
        //initialize int[] scoresTwo = score.clone();
        
        //sort the array descending with Arrays.sort(scoresTwo, Collections.reverseOrder());
        //Make a hashmap to store values
        //assign first 3 values with names, then the rest start from integer: 4

        //then loop through initial array scores, assigning the value for that 
        // key from the sorted array to the current element

        //return the array

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] scoresTwo = Arrays.stream(score)
                                .boxed()
                                .sorted(Comparator.reverseOrder())
                                .mapToInt(Integer::intValue)
                                .toArray();
        String[] str = new String[score.length];

        for (int i = 0; i < scoresTwo.length; i++) {
            if (i == 0) map.put(scoresTwo[i], -1); //gold
            if (i == 1) map.put(scoresTwo[i], -2); //silver
            if (i == 2) map.put(scoresTwo[i], -3); //bronze
            if (i > 2) {
                map.put(scoresTwo[i], i+1);
            }
        }
        for (int x = 0; x < score.length; x++) {
            if (map.get(score[x]) == -1) {
                str[x] = "Gold Medal";
                continue;
            }
            if (map.get(score[x]) == -2) {
                str[x] = "Silver Medal";
                continue;
            }
            if (map.get(score[x]) == -3) {
                str[x] = "Bronze Medal";
                continue;
            }   
            str[x] = String.valueOf(map.get(score[x]));
        }
        return str;

    }
}