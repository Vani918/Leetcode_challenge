
// class Solution {
//     public boolean isPalindrome(String s) {

//         String[] word =s.trim().split("");
//         String[] word2=new String[word.length];
//         for(int i=word.length();i>=0;i--){
//             if(word[i].equals(-) || word[i].equals(,) || word[i].equals(.)){
//                 i--;
//             }
//             word2[i]=word[i];
//         }
//         if(word2.equals(word)){
//             return true;
//         }
//         return false;
//     }
// } //not correct

class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;
        // Place two pointers one at the left one at the right Compare untill left Less than right
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++; // Move one step right
            right--; // move one step left
        }
        return true;
    }
}