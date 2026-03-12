public class longest_comon_prefix {
public static void main(String[] args) {
    String[] str={"dog","racecar","car"};
    
    for(int i=0;i<str[0].length();i++){
        char c=str[0].charAt(i);
        boolean flag=true;
        for(int j=1;j<str.length;j++){
            if(i>=str[j].length() || str[j].charAt(i)!=c){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println(str[0].substring(0,i));
            return;
        }
    }
   
}}