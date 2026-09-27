class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq=new int[26];
        int maxlength=0;
        int maxfreq=0;
        int low=0;

        for(int high=0;high< s.length();high++)
        {
            char ch=s.charAt(high);
            freq[ch -'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            while((high-low+1) -maxfreq >k)
            {
                char leftchar=s.charAt(low);
                freq[leftchar-'A']--;
                low++;
            }
            maxlength=Math.max(maxlength,high-low+1);
        }

        return maxlength;
    }
}