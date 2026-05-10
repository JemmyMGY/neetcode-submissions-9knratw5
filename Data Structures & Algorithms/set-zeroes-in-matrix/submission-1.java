class Solution {
    public void setZeroes(int[][] matrix) {

        boolean firstRowHasZero = false, firstColumnHasZero = false;

        for(int col = 0; col < matrix[0].length; col++){
            if(matrix[0][col] == 0){
                firstRowHasZero = true;
                break;
            }
        }

        for(int row = 0; row < matrix.length; row++){
            if(matrix[row][0] == 0){
                firstColumnHasZero = true;
                break;
            }
        }

        // set zero Markers in first row and col
        for(int row=1; row < matrix.length; row++){
            for(int col=1; col < matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        // set corresponding cell to zero for first row and/or column 
        for(int row=1; row < matrix.length; row++){
            for(int col=1; col < matrix[row].length; col++){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
        }

        if(firstRowHasZero){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[0][col] = 0;
            }
        }

        if(firstColumnHasZero){
            for(int row = 0; row < matrix.length; row++){
                matrix[row][0] = 0;
            }
        }



        
    }
}
