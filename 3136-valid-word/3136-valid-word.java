// class Solution {
//     public boolean isValid(String word) {
//         if (word.length() < 3) {
//             return false;
//         }
//         int vowelCount = 0;
//         int consonantCount = 0;
//         List<Character> vowels = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
//         for (int i = 0; i < word.length() ; i++) {
//             char ch = word.charAt(i);
//             if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
//                 System.out.println("not proper value");
//                 return false;
//             }
//             if (vowels.contains(ch)) {
//                 vowelCount++;
//             } else if (!Character.isDigit(ch)) {
//                 consonantCount++;
//             }
//         }
//         if (vowelCount == 0 && consonantCount == 0) {
//             return false;
//         }
//         return true;
//     }
// }

public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n < 3) {
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return vowels >= 1 && consonants >= 1;
    }
}