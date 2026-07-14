class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
 
    int n = fruits.length; 
    int[] positions = new int[n]; 
    long[] prefixSum = new long[n + 1];
 
    for (int i = 0; i < n; i++) {

        positions[i] = fruits[i][0];

        prefixSum[i + 1] = prefixSum[i] + fruits[i][1];
    }

    int left = 0;

    long maxFruits = 0;
 
    for (int right = 0; right < n; right++) {

           while (left <= right &&
               minimumSteps(positions[left], positions[right], startPos) > k) {

            left++;
        } 
        long currentFruits = prefixSum[right + 1] - prefixSum[left];

        maxFruits = Math.max(maxFruits, currentFruits);
    }

    return (int) maxFruits;
}

 
private int minimumSteps(int leftPosition, int rightPosition, int startPos) {

 
    if (rightPosition <= startPos) {
        return startPos - leftPosition;
    }
 
    if (leftPosition >= startPos) {
        return rightPosition - startPos;
    }
 
    int leftFirst =
            2 * (startPos - leftPosition)
            + (rightPosition - startPos);
 
    int rightFirst =
            2 * (rightPosition - startPos)
            + (startPos - leftPosition);
 
    return Math.min(leftFirst, rightFirst);
 
    }
}