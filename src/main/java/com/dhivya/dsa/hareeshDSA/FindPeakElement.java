class FindPeakElement{

    /*
    https://leetcode.com/problems/find-peak-element/description/?envType=problem-list-v2&envId=array
    Tc: O(n)
     */
    public int findpeakElement(int[] nums){
        int n= nums.length;
        if(n==0){
            return -1;
        }
        int maxEelement =0;
        int maxIndex =0;

        for(int i=0; i<n; i++){
            if(nums[i] > maxElement)
            {
                maxElement =  nums[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}