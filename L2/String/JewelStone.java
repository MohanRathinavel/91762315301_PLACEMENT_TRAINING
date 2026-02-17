
import java.util.HashSet;

public class JewelStone {
    public static void main(String[] args) {
        String jewel="aA";
        String stone="aAAbbbb";
        int c=0;
        for(int i=0;i<stone.length();i++){
            for(int j=0;j<jewel.length();j++){
                if(stone.charAt(i)==jewel.charAt(j)){
                    c++;
                    break;
                }
                
            }
        }
                System.out.print("\n"+c);

        HashSet<Character> jewelset=new HashSet<>();
        for (char j:jewel.toCharArray()){
            jewelset.add(j);
        }
        int count=0;
        for(char s:stone.toCharArray()){
            if(jewelset.contains(s)){
                count++;
            }
        }
        System.out.print(count);
    }
}
