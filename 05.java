class Solution {
    
    Random random;
    int[] Warr;
        
    public Solution(int[] w) {
        this.random = new Random();
        for(int i=1;i<w.length;i++){
            w[i] += w[i-1];
        }
        this.Warr = w;
    }
    
    public int pickIndex() {
        int index = random.nextInt(Warr[Warr.length-1])+1;
        int left = 0, right = Warr.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(Warr[mid] == index)
                return mid;
            else if(Warr[mid] < index)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */