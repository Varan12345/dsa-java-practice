public class value_counts {

    static boolean check_vowels(char c){
     
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args){

        String st = "everyonelearningdsa";
        int k = 5;

        int ans = 0;
        int cmax = 0;

        // first window
        for(int i = 0; i < k; i++){
            if(check_vowels(st.charAt(i))){
                cmax++;
            }
        }

        ans = cmax;

        // sliding window
        for(int i = k; i < st.length(); i++){

            if(check_vowels(st.charAt(i))){
                cmax++;
            }

            if(check_vowels(st.charAt(i - k))){
                cmax--;
            }

            ans = Math.max( cmax, ans);
;        }

        System.out.println("Maximum vowels in window = " + ans);
    }
}