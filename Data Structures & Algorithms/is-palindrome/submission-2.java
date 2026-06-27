class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^a-z0-9]","").toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i++] != arr[j--]) return false;
            

        }
        return true;
    }
}
