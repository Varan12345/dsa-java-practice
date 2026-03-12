public class container_with_mostwater {
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=arr.length-1;
        int max_area=0;
        while(left<right){
            int height=Math.min(arr[left], arr[right]);
            int width=right-left;
            int area=height*width;
            max_area=Math.max(max_area, area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max_area);
    }
}
