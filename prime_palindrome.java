class  Solution{
   public int primePalindrome(int n) {
      if (n >= 8 && n <= 11) {
         return 11;
      }
      for(int length=1; length <6; length++){
        int start = (int)Math.pow(10, length-1);
        int end = (int)Math.pow(10, length);

        for(int i=start; i<end;i++){
            int palindrome = createPalindrome(i);
            if(palindrome >= n && isPrime(palindrome)){
                return palindrome;
            }
        }
      }
      return -1;
    }
    public int createPalidrome(int num){
        int pal=num;
        num /= 10;
        while(num>0){
            pal = pal*10 + num%10;
            num /= 10;
        }
        return pal;
    }
    private boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i==0){

            return false;
            }
        }
    
        return true;
    }

    ///
}