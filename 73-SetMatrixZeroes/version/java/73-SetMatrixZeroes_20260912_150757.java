// Last updated: 12/09/2026, 15:07:57
1class Solution {
2    public void setZeroes(int[][] matrix) {
3      int rowl=matrix.length;
4      int coll=matrix[0].length;
5      int row[]=new int[rowl];
6      int col[]=new int[coll];
7      for(int i=0;i<rowl;i++){
8        for(int j=0;j<coll;j++){
9            if(matrix[i][j]==0){
10            row[i]=1;
11            col[j]=1;
12            }
13        }
14
15      }
16      for(int i=0;i<rowl;i++){
17        for(int j=0;j<coll;j++){
18            if(row[i]==1 || col[j]==1){
19            matrix[i][j]=0;
20            }
21
22
23        }
24      }
25
26    }
27}