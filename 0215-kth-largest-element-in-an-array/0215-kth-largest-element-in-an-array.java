class Solution {
    private int findQuickSelect(int []nums,int left,int right,int k){
        if (left == right) return nums[left];

	int pIndex = new Random().nextInt(right - left + 1) + left;
	pIndex = partition(nums, left, right, pIndex);

	if (pIndex == k) return nums[k];
	else if (pIndex < k) return findQuickSelect(nums, pIndex+1, right, k);
	return findQuickSelect(nums, left, pIndex-1, k);
    }
    
    private int partition(int[] nums, int left, int right, int pIndex) {
	int pivot = nums[pIndex];
	swap(nums, pIndex, right);
	pIndex = left;

	for (int i=left; i<=right; i++) 
		if (nums[i] <= pivot) 
			swap(nums, i, pIndex++);

	return pIndex - 1;
}
    
    private void swap( int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public int findKthLargest(int[] nums, int k) {
       return findQuickSelect(nums,0,nums.length-1,nums.length-k);
    }
}