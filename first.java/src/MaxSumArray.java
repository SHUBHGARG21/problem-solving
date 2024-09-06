import java.util.Arrays;

class Solution {
     public static void main(String[] args) {
         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
         int sum = 0;
         int max = nums[0];

         for(int num: nums){
             sum += num;
             max = max < sum? sum : max;
             sum = sum < 0? 0 : sum;
         }
         System.out.println(max);


     }
}

