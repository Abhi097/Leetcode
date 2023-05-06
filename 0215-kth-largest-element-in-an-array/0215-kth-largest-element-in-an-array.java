class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            queue.add(nums[i]);
        }
       for(int i=1;i<k;i++){
           queue.poll();
       }
        return queue.peek();
    }
}