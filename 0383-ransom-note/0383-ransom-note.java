class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i=0,j=0;

        // if( magazine.indexOf(ransomNote.charAt(i))!=-1 ){   j = magazine.indexOf(ransomNote.charAt(i)); }
        // else{   return false;  }

        // if( j+ransomNote.length() < magazine.length() ){
        //     for( ;i<ransomNote.length();i++)
        //     {
        //         if( ransomNote.charAt(i) != magazine.charAt(j) ){
        //             return false;
        //         }
        //         else{
        //             j++;
        //         }
        //     }
        // }
        // else{
        //     return false;
        // }

        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Arrays.sort(r);  Arrays.sort(m);

        while(true)
        {
            if( i<r.length && j<m.length && r[i] == m[j]){
                i++;  j++;
                continue;
            }
            else if( i<r.length && j<m.length && r[i] < m[j] ){
                 break;
            }
            else if( i<r.length && j<m.length && r[i]>m[j] ){
                j++;
            }
            else{
                break;
            }
        }
        if( i == r.length ){ return true; }
        return false;
    }
}