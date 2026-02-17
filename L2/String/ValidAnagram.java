public class ValidAnagram {
    public boolean anagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChars=s.toCharArray();
        char[] tChars=t.toCharArray();
        java.util.Arrays.sort(sChars);
        java.util.Arrays.sort(tChars);
        return java.util.Arrays.equals(sChars, tChars);
    }


    public static void main(String[] args) {
        ValidAnagram sol=new ValidAnagram();
        String s="anagra";
        String t="nagaram";
        
        System.out.println(sol.anagram(s,t));
    }
}
