class Solution {
    public void moveZeroes(int[] arr) {

        
		  int j=0;
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[j]==0 && arr[i]!=0)
			  {
				  int temp=arr[j];
				  arr[j]=arr[i];
				  arr[i]=temp;
				  j++;
			  }
			  if (arr[j]!=0) {
				j++;
			}
			  
		  }
        
    }
}