// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         s.sort();//string does not have sorting function Have to convert them into Character arrays and Using the array collection frameworks sort it
//         t.sort();
//         String[] sWord= s.split("");
//         String[] tWord= t.split("");
//         for(int i=0;i<sWord.length();i++){
//             if(!sWord[i].equals(tWord[i])){
//                 return false;
//             }
//         }
//     return true;
//     }
// }

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
      
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert both strings into character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Step 3: Sort both character arrays
        // Strings don’t have a sort method, but char[] can be sorted
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Step 4: Compare the sorted arrays
        // If they are identical, then s and t are anagrams
        return Arrays.equals(sChars, tChars);
    }
}
