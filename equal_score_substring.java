class Solution{
    public boolean scorebalenced(String s){
        int total=0;

        for(int i=0;i<s.length();i++){
            total+=s.charAt(i)-'a'+1;
        }
        int left=0;
        for(int i=0;i<s.length();i++){
            left+=s.charAt(i)-'a'+1;
            if(left*2==total){
                return true;
            }
        }
        return false;
       // System.out.println();
    }
      }