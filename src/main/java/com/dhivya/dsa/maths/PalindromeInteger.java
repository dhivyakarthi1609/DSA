class PalindromeInteger {
    public boolean isPalindrome(int x) {
        int dupNum = x;
        int revNum =0;
        while(x>0){

            int lastDigit = x%10;

            revNum = revNum*10 + lastDigit;

            x = x/10;
        }

        return dupNum==revNum;
    }
}