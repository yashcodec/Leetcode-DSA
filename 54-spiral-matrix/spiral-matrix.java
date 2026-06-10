class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> res = new ArrayList<>(m * n);
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (res.size() < m * n) {
            for (int i = left; i <= right && res.size() < m * n; i++) res.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom && res.size() < m * n; i++) res.add(matrix[i][right]);
            right--;
            for (int i = right; i >= left && res.size() < m * n; i--) res.add(matrix[bottom][i]);
            bottom--;
            for (int i = left; i <= right && res.size() < (m * n) && i >= top; i--) {} 
            for (int i = bottom; i >= top && res.size() < m * n; i--) res.add(matrix[i][left]);
            left++;
        }
        return res;
    }
}