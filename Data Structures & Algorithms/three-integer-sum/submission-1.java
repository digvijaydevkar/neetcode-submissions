class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resl = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
           if(i>0 && nums[i] == nums[i-1]) continue;
            int low = i+1,high=n-1;
           
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum < 0) low++;
                else if(sum > 0) high--;
                else {
                resl.add(new ArrayList<>(Arrays.asList(nums[i],  nums[low],  nums[high])));
                while(low<high && nums[low] == nums[low+1]) low++;
                while(high>low && nums[high] == nums[high-1]) high--;
                low++;
                high--;
                }
            }
        }
        return resl;
    }
}
