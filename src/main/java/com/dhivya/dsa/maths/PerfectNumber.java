class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum =0;
        int duplNum = num;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum==duplNum;
    }

}