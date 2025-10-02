import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        int[] prefix = new int[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int result = 0;

        int bestFirst = 0;
        for (int i = firstLen + secondLen; i <= nums.length; i++) {
            int sumFirst = prefix[i - secondLen] - prefix[i - secondLen - firstLen];
            bestFirst = Math.max(bestFirst, sumFirst);

            int sumSecond = prefix[i] - prefix[i - secondLen];
            result = Math.max(result, bestFirst + sumSecond);
        }

        int bestSecond = 0;
        for (int i = firstLen + secondLen; i <= nums.length; i++) {
            int sumSecond = prefix[i - firstLen] - prefix[i - firstLen - secondLen];
            bestSecond = Math.max(bestSecond, sumSecond);

            int sumFirst = prefix[i] - prefix[i - firstLen];
            result = Math.max(result, bestSecond + sumFirst);
        }

        return result;
    //     int storage1 = 0;
    //     int storage2 = 0;

    //     ArrayList<int[]> list1 = new ArrayList<>();
    //     ArrayList<int[]> list2 = new ArrayList<>();
    //     ArrayList<int[]> storageList1 = new ArrayList<>();
    //     ArrayList<int[]> storageList2 = new ArrayList<>();

    //     int bestStart1 = -1;

    //     for (int i = 0; i < nums.length - firstLen + 1; i++) {
    //         int[] arr = new int[firstLen];
    //         int sum = 0;
    //         for (int j = 0; j < firstLen; j++) {
    //             arr[j] = nums[i + j];
    //             sum += nums[i + j];
    //         }
    //         list1.add(arr);
    //         if (sum > storage1) {
    //             storage1 = sum;
    //             storageList1.clear();
    //             storageList1.add(arr);
    //             bestStart1 = i;
    //         }
    //     }

    //     for (int[] x : list1) {
    //         int count = 0;
    //         for (int g : x) {
    //             count += g;
    //         }
    //         if (count > storage1) {
    //             storage1 = count;
    //             storageList1.clear();
    //             storageList1.add(x);
    //         }
    //     }

    //     for (int i = 0; i < nums.length - secondLen + 1; i++) {
    //         if (!(i + secondLen - 1 < bestStart1 || i > bestStart1 + firstLen - 1)) continue;

    //         int[] arr2 = new int[secondLen];
    //         int sum = 0;
    //         for (int j = 0; j < secondLen; j++) {
    //             arr2[j] = nums[i + j];
    //             sum += nums[i + j];
    //         }
    //         list2.add(arr2);
    //         if ( sum > storage2) {
    //             storage2 = sum;
    //             storageList2.clear();
    //             storageList2.add(arr2);
    //         }
    //     }
    //     return storage1 + storage2;
    }
}