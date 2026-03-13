import java.util.HashMap;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0,5));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("World"));
        System.out.println(str.replace('l', 'x'));
        
        String s="java tough to learn";
        String [] s2 = str.split(" ");
        for (String s1 : s2) {
            System.out.println(s);
        }
    //   String s3="hello";
      // for (int i = s3.length() - 1; i >= 0; i--) {
        //    System.out.print(s3.charAt(i));
         // }
 // plaindrome 
        String s4="madam";
        String s5="";
        for (int i = s4.length() - 1; i >= 0; i--) {
            s5 += s4.charAt(i);
        }
        System.out.println(s5);

//count vowels and consonants
        String s7="hello world";
     
        int vowel=0;
        int consonant=0;
        for(int i=0;i<s7.length();i++){
            char c=s7.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            }
            else if(c>='a' && c<='z'){
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

    // frequency count 
     String str1="banana";
     HashMap<Character , Integer>map=new HashMap<>();
     for (char c: str1.toCharArray())
     {
        map.put(c, map.getOrDefault(c,0)+1   );
     }
     System.out.println(map);



    //anagrams

    String str2="are";
    String str3="era"; 
    char []arr1 =str2.toCharArray();
    char [] arr2= str3.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if (Arrays.equals(arr1,arr2)){
        System.out.println("anagrams");
    }else{
        System.out.println("not an anagrams");
    }

    String str4="dsa job ke stah bhi job knad bhi";
    System.out.println(str4.replaceAll(" ",""));


        }
     }




    


