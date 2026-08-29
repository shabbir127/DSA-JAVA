class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
		int n=arr.length;
		int closestSum=arr[0]+arr[1]+arr[2];
		//int closestSum=Integer.MAX_VALUE;
		for(int i=0; i < n ;i++)
		{
			int left=i+1;
			int right=n-1;
			
			while(left < right )
			{
				int CurrentSum=arr[i]+arr[left]+arr[right];
				if(Math.abs(CurrentSum -target) < Math.abs(closestSum-target))
				{
					closestSum=CurrentSum;
				}
				if (CurrentSum < target) {
					left ++;
				}else {
					right --;
				}
			}
			
		}
		
		return closestSum;
		
    }
}