public class arr_rotation {
    public static void main(String[] args) {
        int []arr={1,3,5,7,2,8};
        int k=3 ;
         k=k%arr.length;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[(i+k)%arr.length]+" ");

        }
    }
}
