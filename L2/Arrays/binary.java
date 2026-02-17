public class binary {
    public static void main(String[] args){
        int[] nums={1,3,4,6,8,9, 10, 11};
        int target=11;
        int result=search(nums, target);

        System.out.println(result);
    }
    public static int search(int[] nums,int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
return -1;
    }
}
