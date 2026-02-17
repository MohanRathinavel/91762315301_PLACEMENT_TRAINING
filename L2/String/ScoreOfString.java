public class ScoreOfString {
    public static void main(String[] args) {
        String s="hello";
        char[] chars=s.toCharArray();
        int score=0;
        for (int i=0;i<s.length()-1;i++){
            int diff=Math.abs(chars[i]-chars[i+1]);
            score +=diff ;
        }
        System.out.print(score);
    }
}
