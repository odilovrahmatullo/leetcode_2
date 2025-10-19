package remove_element;

public class Solution {
    public static void main(String[] args) {
        //Input: nums = [1,1,2]
        //Output: 2, nums = [1,2,_]
        System.out.println(removeElement(new int[]{3, 2, 2, 3},3));
    }

    public static int removeElement(int[] nums, int val ) {
        int j = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
