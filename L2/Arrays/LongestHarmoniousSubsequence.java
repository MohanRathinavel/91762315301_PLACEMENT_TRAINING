
import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(find(nums));
    }
    public static int find(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);
           
        }
        int max=0;
        for(int key:map.keySet()){
            if(map.containsKey(+1)){
                int length=map.get(key)+map.get(key+1);
                max =Math.max(max,length);
            }
        }
        return max;
    }
}
