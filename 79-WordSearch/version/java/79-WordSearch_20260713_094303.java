// Last updated: 13/07/2026, 09:43:03
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4
5        int rows = board.length;
6        int cols = board[0].length;
7
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10
11                if (dfs(board, word, i, j, 0))
12                    return true;
13            }
14        }
15
16        return false;
17    }
18
19    public boolean dfs(char[][] board, String word, int i, int j, int index) {
20
21        // Word found
22        if (index == word.length())
23            return true;
24
25        // Out of boundary
26        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
27            return false;
28
29        // Character doesn't match
30        if (board[i][j] != word.charAt(index))
31            return false;
32
33        // Mark visited
34        char temp = board[i][j];
35        board[i][j] = '#';
36
37        // Explore 4 directions
38        boolean found =
39                dfs(board, word, i + 1, j, index + 1) ||
40                dfs(board, word, i - 1, j, index + 1) ||
41                dfs(board, word, i, j + 1, index + 1) ||
42                dfs(board, word, i, j - 1, index + 1);
43
44        // Backtrack
45        board[i][j] = temp;
46
47        return found;
48    }
49}