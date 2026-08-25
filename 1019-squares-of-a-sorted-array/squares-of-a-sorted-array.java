class Solution {
    public int[] sortedSquares(int[] nums) {
         int left=0;
		  int right=nums.length-1;
		  int k=right;
		  int[] result=new int[right+1];
		  while(left<=right)
		  {
			  int leftSquare=nums[left]*nums[left];
			  int rightSquare=nums[right]*nums[right];
			  if(leftSquare < rightSquare)
			  {
				  result[k]=rightSquare;
				  k--;
				  right--;
			  }else {
				  result[k]=leftSquare;
				  k--;
				  left++;
			}
		  }
		  for(int a:result)
		  {
			  System.out.print(a + " ");
		  }
		  return result;


    }
}