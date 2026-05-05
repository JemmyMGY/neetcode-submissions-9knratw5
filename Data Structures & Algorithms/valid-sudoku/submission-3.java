class Solution {

    public boolean isValidSudoku(char[][] board) {

        Set<String> uniqueSet = new HashSet<>();


        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.') continue;
                
                char currentChar = board[row][col];


                if(!uniqueSet.add(currentChar + " in row " + row) || !uniqueSet.add(currentChar + " in col " + col) || !uniqueSet.add(currentChar + " in subgrid " + row/3 + "-" + col/3))
                    return false;

            }
        }

        return true;
    }
}
