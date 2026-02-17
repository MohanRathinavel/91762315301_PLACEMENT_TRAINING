public class lenlastword {
    public static void main(String[] args) {
        String s="i know programming ";
        s=s.trim();
        int l=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)!=' '){
                i--;
                l++;

        }
    
        System.out.println(l);
    }
    
}