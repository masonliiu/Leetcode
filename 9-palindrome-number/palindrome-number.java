class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        String reverse = "";
        Stack<String> xx = new Stack<>();
        for (char a : y.toCharArray()) {
            xx.push(String.valueOf(a));
        } 
        while (!xx.isEmpty()) {
            reverse += xx.pop();
        }
        if (reverse.equals(y)) {
            return true;
        }
        return false;
        
    }
}