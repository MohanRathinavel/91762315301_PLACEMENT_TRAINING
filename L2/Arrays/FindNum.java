import java.util.*;

public class FindNum {
    public static void main(String[] args) {
        int[] nums={0,4,2};
        List <Integer> missing=find(nums);
        System.out.println(missing);

    }
    public static List<Integer> find(int[] nums){
        Set<Integer> set=new HashSet<>();
        List<Integer> result=new ArrayList<>();
        for(int num:nums)set.add(num);
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) result.add(i);
        }
        return result;
    }
}
