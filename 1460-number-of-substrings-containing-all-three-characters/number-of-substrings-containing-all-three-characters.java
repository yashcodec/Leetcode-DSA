class Solution {
    public int numberOfSubstrings(String s) {
        
        int i = 0 , j = 0 , n = s.length() ;
        int[] ans = new int[3] ;
        int count = 0 ;
        if(n < 3) return 0 ;
        while(j < n)
        {
            ans[s.charAt(j) - 'a']++ ; // ans[167-167] = ans[0]
            while(ans[0] > 0 && ans[1] > 0 && ans[2] > 0)
            {
                count = count + n - j ;
                ans[s.charAt(i) - 'a']-- ;
                i++ ;
            }
            j++ ;
        }
        return count ;
    }
}