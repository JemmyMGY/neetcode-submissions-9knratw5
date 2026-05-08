class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }


        for(int row : rowSet){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = 0;
            }
        }

        for(int col : colSet){
            for(int row = 0; row < matrix.length; row++){
                matrix[row][col] = 0;
            }
        }

        
    }
}
