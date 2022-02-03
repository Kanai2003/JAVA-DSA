
import java.util.HashSet;
public class recursion2 {
    // Qs:-print all the subsequences of a string ===================
    // public static void subsequences(String str , int idx , String newString,HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         }else{
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
           
    //     }
    //     char currChar = str.charAt(idx);
    //     subsequences(str, idx+1, newString+currChar,set);
    //     subsequences(str, idx+1, newString,set);   
    // }


    // public static boolean[] map = new boolean[26];
    // public static void removeDup(String str , int idx , String newString){
    //     if(idx == str.length()){
    //         System.err.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (map[currChar - 'a']){
    //         removeDup(str, idx+1, newString);
    //     }else{
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDup(str, idx+1, newString);
    //     }
    // }

    
   public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   public static void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i = 1 ; i<=mapping.length(); i++){
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
   }
    public static void main(String[] args) {
        // String str = "abcde";
        HashSet<String> set= new HashSet<>();
        // subsequences(str,0, "",set);
        // String str = "bcdabdbaabcbacdbd";
        // removeDup(str, 0,""); 
        String str = "23";
        printComb(str, 0, "");
    }
}
