class Solution {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(citations[mid] == citations.length - mid)
                return citations.length - mid;
            if(citations[mid] < citations.length - mid)
                low = mid + 1;
            else
                high = mid;
        }
        return citations.length - low;
    }
}