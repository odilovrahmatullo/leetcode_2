package remove_duplicate;

public class Solution {
    public static void main(String[] args) {
        //Input: nums = [1,1,2]
        //Output: 2, nums = [1,2,_]
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[j]!=nums[i]){
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j+1;
    }
}
