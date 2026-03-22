class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        char[] ss = s.toUpperCase().toCharArray();
        char[] tt = t.toUpperCase().toCharArray();
        if (ss.length != tt.length) return false;

        for (int i = 0; i < ss.length; i++) {
            map.put(ss[i],map.getOrDefault(ss[i],0)+1);
        }

        for (int i = 0; i < tt.length; i++) {
            map2.put(tt[i],map2.getOrDefault(tt[i],0)+1);
        }

        if(map.equals(map2))
        {
           return true;
        }
        else
        {
            return false;
        }
    }
    
}