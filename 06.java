class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //Arrays.sort(people, (a,b) -> (b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]));
//         if (people == null || people.length == 0) {
//             return new int[0][0];
//         }
//         Queue<int[]> pq = new PriorityQueue<>(people.length, (a, b) ->(b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]));
        
//         for(int[] i: people){
//             pq.offer(i);
//         }
//         List<int[]> list = new ArrayList<>();
//         while(!pq.isEmpty()){
//             int[] curr = pq.poll();
//             list.add(curr[1], curr);
//         }
//         return list.toArray(new int[people.length][2]);
        if (people == null || people.length == 0) {
            return new int[0][0];
        }
        // in order of height -> pos
        Queue<int[]> heap = new PriorityQueue<>(people.length, (a, b) -> {
            int result = Integer.compare(b[0], a[0]);
            return result == 0 ? Integer.compare(a[1], b[1]) : result;
        });
        for (int[] person : people) {
            heap.offer(person);
        }
        List<int[]> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            int[] curr = heap.poll();
            result.add(curr[1], curr);
        }
        return result.toArray(new int[people.length][2]);
    }
}