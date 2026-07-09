class Solution {
    public long reverse(long a){
        long b = 0L;
        while(a>0){
            int digit =(int) a%10;
            b = b*10 + digit;
            a/=10;
        }
        return b;
    } 
    public long sumAndMultiply(int n) {
        long rev = 0L;
        long sum = 0L;
        while(n>0){
            int digit = n%10;
            if(digit!=0) rev = rev*10 + digit;
            sum+=digit;
            n/=10;
        }
        long res = reverse(rev);
        return res*sum;


    }
}