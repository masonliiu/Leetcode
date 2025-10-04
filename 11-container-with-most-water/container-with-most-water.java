class Solution {
    public int maxArea(int[] height) {
        int storage = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right) {
            if ((right - left) * ((height[right] > height[left]) ? height[left] : height[right]) > storage) {
                storage = (right - left) * ((height[right] > height[left]) ? height[left] : height[right]);
            } 
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return storage;

            // for (int i = 0; i < height.length; i++) {
        //     for (int x = i; x < height.length; x++) {
        //         if (Math.abs(x - i) * Math.min(height[x], height[i]) > storage) {
        //             storage = Math.abs(x - i) * Math.min(height[x], height[i]);
        //         }
        //     }
        // }
        
        // if (Math.abs(height.length-1 - 0) * Math.min(height[height.length-1], height[0]) > storage) {
        //     storage = Math.abs(height.length-1 - 0) * Math.min(height[height.length-1], height[0]);
        // } 
        // for (int i = 1; i < height.length; i++) {
        //     if (Math.abs(height.length-i - i) * Math.min(height[height.length-i], height[i]) > storage) {
        //             storage = Math.abs(height.length-i - i) * Math.min(height[height.length-i], height[i]);
        //         }
        // }
        // return storage;
    }
}