class Solution {
    public boolean isPalindrome(int x) {
        int revNum =0;

        int duplicate= x;

        while(x>0)
        {
            int lastdigit = x %10;
            revNum = (revNum*10)+lastdigit;

            x=x/10;


        }

        if(duplicate==revNum)
        {
            return true;

        }
        else 
        {
            return false ;

        }
    }
}