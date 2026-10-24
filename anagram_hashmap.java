import java.util.HashMap;

public class anagram_hashmap {
    public static void main(String[] args) {
        String s="hello";
        String t="gello"

        if(s.length()!=t.length()){
            System.out.println(false);
            return;
        }
     HashMap<Character,Integer> map=new HashMap<>();
     
    for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)|| map.get(ch)==0){
                System.out.println(false);
                return;
            }
        map.put(ch,map.get(ch)-1);
}
    System.out.println(true);
}
}