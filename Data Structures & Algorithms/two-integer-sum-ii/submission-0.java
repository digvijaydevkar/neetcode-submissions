class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i=0;i<n-1;i++){
            int low=i+1,high=n-1,val=target -numbers[i];
            while(low<=high){
                int mid = low + (high-low)/2;
                if(numbers[mid] == val) return new int[] {i+1,mid+1};
                if(numbers[mid] > val) high = mid-1;
                else low = mid+1;
                System.out.println(val);
            }
        }
        return new int[] {-1,-1};
    }
}
