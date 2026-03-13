// public class reverse_string {
//     public static void main(String[] args) {
//         String str="java program";
//         String []str1=str.split(" ");
//         for (String str11:str1){
//             String temp="";
        
//         for (int i=str.length()-1;i>=0;i--){
//            temp+=str11.charAt(i);
//         }
//         System.out.println(temp);
//     }
//     System.out.println();
// }
// }
public class reverse_string {
    public static void main(String[] args) {

        String str="java program";
        String []str1=str.split(" ");

        for (String str11 : str1) {

            String temp="";

            for (int i=str11.length()-1;i>=0;i--){
                temp += str11.charAt(i);
            }

            System.out.println(temp);
        }
    }
}
