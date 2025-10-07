class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {

        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) return -1;

        q.add(startGene);
        visited.add(startGene);
        int level = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(endGene)) return level;

                for (int pos = 0; pos < 8; pos++) {
                    for (char c : new char[] {'A', 'C', 'G', 'T'}) {
                        if (c == curr.charAt(pos)) continue;
                        String next = curr.substring(0, pos) + c + curr.substring(pos+1);
                        if (bankSet.contains(next) && !visited.contains(next)) {
                            q.offer(next);
                            visited.add(next);
                        }

                    }
                }
            }
            level++;
        }
        return -1;
        // StringBuilder copy = new StringBuilder();
        // ArrayList<String> bank2 = new ArrayList<>(Arrays.asList(bank));
        // int count = 0;

        // for (int i=0; i<8; i++) {
        //     if (endGene.charAt(i) == startGene.charAt(i)) {
        //         continue;
        //     }

        //     copy= new StringBuilder(startGene);
        //     if (endGene.charAt(i) == 'A') {
        //         copy.replace(i, i+1, "A");
        //         if (bank2.contains(copy.toString())) {
        //             count++;
        //             startGene=copy.toString();
        //             System.out.println("bank has it. " + copy.toString());
        //         } else {
        //             System.out.println("else statement: " + copy.toString());
        //             return -1;
        //         }
        //     } else if (endGene.charAt(i) == 'C') {
        //         copy.replace(i, i+1, "C");
        //         if (bank2.contains(copy.toString())) {
        //             count++;
        //             startGene=copy.toString();
        //             System.out.println("bank has it. " + copy.toString());
        //         } else {
        //             System.out.println("else statement: " + copy.toString());
        //             return -1;
        //         }
        //     } else if (endGene.charAt(i) == 'G') {
        //         copy.replace(i, i+1, "G");
        //         if (bank2.contains(copy.toString())) {
        //             count++;
        //             startGene=copy.toString();
        //             System.out.println("bank has it. " + copy.toString());
        //         } else {
        //             System.out.println("else statement: " + copy.toString());
        //             return -1;
        //         }
        //     } else if (endGene.charAt(i) == 'T') {
        //         copy.replace(i, i+1, "T");
        //         if (bank2.contains(copy.toString())) {
        //             count++;
        //             startGene=copy.toString();
        //             System.out.println("bank has it. " + copy.toString());
        //         } else {
        //             System.out.println("else statement: " + copy.toString());
        //             return -1;
        //         }
        //     }
        // }
        // return count;
    }
}