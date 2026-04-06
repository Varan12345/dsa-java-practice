public class highest_altitude {
public static void main(String[] args) {
    int arr[] = {-4,-3,-2,-1,4,3,2};
    int altitude = 0;
    int max_altitude = 0;
    for (int i = 0; i < arr.length; i++) {
        altitude += arr[i];
        max_altitude = Math.max(max_altitude, altitude);
    }   System.out.println("The highest altitude is: " + max_altitude);
    System.out.println();

}}