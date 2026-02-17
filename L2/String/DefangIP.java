public class DefangIP {
    public static void main(String[] args) {
        String s="1.1.1.1";
        s=s.trim();
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                result+="[.]";
            }else{
                result+=s.charAt(i);
            }
        }
        String defanged=s.replace(".", "[.]");
        System.out.println(defanged);
        System.out.println(result);
}
}