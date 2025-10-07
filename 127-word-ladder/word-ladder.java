class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> bankSet = new HashSet<>(wordList);
        if (!bankSet.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        q.offer(beginWord);
        visited.add(beginWord);
        int level = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(endWord)) return level + 1;

                char[] arr = curr.toCharArray();
                for (int pos = 0; pos < arr.length; pos++) {
                    char old = arr[pos];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if ( c== old) continue;
                        arr[pos] = c;
                        String next = new String(arr);
                        if (bankSet.contains(next) && visited.add(next)) q.offer(next);
                    }
                    arr[pos] = old;
                }
            }
            level++;
        }
        return 0;
        
    }
}