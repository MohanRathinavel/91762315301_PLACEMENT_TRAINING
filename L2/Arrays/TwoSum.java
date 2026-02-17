import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int target=8;
        int[] result=sum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
