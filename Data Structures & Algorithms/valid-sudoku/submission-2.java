class Solution {
    private boolean checkRows(char[][] board) {
        for(int row = 0; row < board.length; row++){
            Set<Character> rowSet = new HashSet<>();
            for(int i = 0; i < board[0].length; i++){
                if(board[row][i] == '.') continue;

                if(rowSet.contains(board[row][i]))
                    return false;
                
                rowSet.add(board[row][i]);
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board){
        for(int col = 0; col < board[0].length; col++){
            Set<Character> colSet = new HashSet<>();
            for(int i = 0; i < board.length; i++){
                if(board[i][col] == '.') continue;
                
                if(colSet.contains(board[i][col]))
                    return false;
                
                colSet.add(board[i][col]);
            }
        }
        return true;
    }

    private boolean checkSubGrids(char[][] board){

        int gridSize = (int) Math.sqrt(board.length);

        for(int subgrid = 0; subgrid < board.length; subgrid++){
            Set<Character> subgridSet = new HashSet<>();
            for(int i = 0; i < gridSize; i++){
                for(int j = 0; j < gridSize; j++){
                    int actualRow = (subgrid / gridSize) * gridSize + i;
                    int actualCol = (subgrid % gridSize) * gridSize + j;

                    if(board[actualRow][actualCol] == '.') continue;

                    if(subgridSet.contains(board[actualRow][actualCol]))
                        return false;

                    subgridSet.add(board[actualRow][actualCol]);
                }   
            }

        }
        return true;

    }


    public boolean isValidSudoku(char[][] board) {

        if(!checkRows(board)) return false;
        if(!checkColumns(board)) return false;
        if(!checkSubGrids(board)) return false;

        return true;
    }
}
