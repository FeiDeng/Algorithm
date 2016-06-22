public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
         if (n == 1) {
            return 10; // should be 11
        }
        int temp=9;
        n=Math.min(n,10);
        int res=10;
        int avalible=9;
        for(int i=1;i<n;i++){
            temp*=10-i;
            res+=temp;
        }
        return res;
    }
}