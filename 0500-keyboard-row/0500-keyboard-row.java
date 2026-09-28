// class Solution {
//     public String[] findWords(String[] words) {
//         List<String> res = new ArrayList<>();
//         String first_row="qwertyuiop",  second_row="asdfghjkl", third_row="zxcvbnm";

//         for( String i:words){
//             String s= i.toLowerCase();
//             boolean isValid = true;
//             if( first_row.contains(s.charAt(0)+"")){
//                 for( char c:s.toCharArray()){
//                     if( !first_row.contains(c+"")) { isValid=false;  break; }
//                 }
//             }
//             else if( second_row.contains(s.charAt(0)+"")){
//                 for( char c:s.toCharArray()){
//                     if( !second_row.contains(c+"")){ isValid=false;  break; }
//                 }
//             }
//             else{
//                 for( char c:s.toCharArray()){
//                     if( !third_row.contains(c+"")){ isValid=false; break; }
//                 }
//             }
//             if( isValid ){
//                 res.add(i);
//             }
//         }
//         return res.toArray(new String[0]);
//     }
// }

import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        int[] row = new int[26];
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (int i = 0; i < r1.length(); i++) row[r1.charAt(i) - 'a'] = 1;
        for (int i = 0; i < r2.length(); i++) row[r2.charAt(i) - 'a'] = 2;
        for (int i = 0; i < r3.length(); i++) row[r3.charAt(i) - 'a'] = 3;

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();
            int targetRow = row[w.charAt(0) - 'a'];
            boolean ok = true;

            for (int j = 1; j < w.length(); j++) {
                if (row[w.charAt(j) - 'a'] != targetRow) {
                    ok = false;
                    break;
                }
            }

            if (ok) res.add(words[i]);
        }

        String[] ans = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}