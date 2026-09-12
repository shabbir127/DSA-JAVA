class Solution {
    public int totalFruit(int[] fruits) {
        
        int n=fruits.length;
        int low=0;
        int res=0;
        Map<Integer,Integer> freq=new HashMap<>();
        
        if(fruits.length ==1)
        {
            return 1;
        }
        for(int high=0; high<n;high++)
        {
            int ch=fruits[high];
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.size() > 2)
            {
                int leftchar=fruits[low];
                freq.put(leftchar,freq.get(leftchar)-1);

                if(freq.get(leftchar) == 0)
                {
                    freq.remove(leftchar);
                }
                low++;
  
            }
             if(freq.size()<=2)
                {
                    res=Math.max(res,high-low+1);
                }
        }

     return res;

    }
}