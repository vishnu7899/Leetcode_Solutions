class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return (fib(n-1)+fib(n-2));
        /*int first_digit=0;
        int second_digit=1;
        int next_digit=0;

        
        for(int i=2;i<=n;i++){
        
         next_digit=first_digit+second_digit;
         first_digit= second_digit;
         second_digit=next_digit;    
        
        }
        return next_digit;*/
    }
}