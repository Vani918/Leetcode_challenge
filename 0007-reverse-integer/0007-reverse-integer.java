class Solution {
    public int reverse(int x) {
        int rem; int sum=0;
        while(x!=0){
        rem=x%10;
         // Check overflow before multiplying
            if (sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE / 10) {
                return 0;
            }
        sum=(sum*10)+rem;
        x=x/10;
        }
        // if(sum>(2(Math.pow(31))-1) || sum<(-2(Math.pow(31)))){
        //     return 0;
        // } this should be done before multiplying
    return sum;
    }
}