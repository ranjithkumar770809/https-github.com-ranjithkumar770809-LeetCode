class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 > n2) return false;

        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        // Fill initial frequency tables for s1 and the first window in s2
        for (int i = 0; i < n1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }

        // Slide the window across s2
        for (int i = 0; i < n2 - n1; i++) {
            if (matches(s1Counts, s2Counts)) return true;

            // Slide window: add character at (i + n1) and remove character at i
            s2Counts[s2.charAt(i + n1) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']--;
        }

        // Check the last window
        return matches(s1Counts, s2Counts);
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}