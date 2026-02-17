public class ReverseVowelOfString {
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args) {
        String s="icecream";
        char[] chars=s.toCharArray();
        char[] vowels=new char[s.length()];   
        int count=0;
        for(int i =0;i<chars.length;i++){
            if(isVowel(chars[i])){
                vowels[count++]=chars[i];
            }
        }
        int j=count-1;
        for(int i=0;i<chars.length;i++){
            if(isVowel(chars[i])){
            chars[i]=vowels[j--];
        } 
    }
        System.out.println("output:" + new String (chars));    
    }
    
}
