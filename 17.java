class Solution {
    public void solve(char[][] board) {
        if(board.length == 0)
            return;
        
        int[][] visited = new int[board.length][board[0].length];
        
        for(int i=0;i<board[0].length;i++){
                if(board[0][i] == 'O')
                    check(board, 0, i, visited);
                if(board[board.length-1][i] == 'O')
                    check(board, board.length-1, i, visited);
            }
        for(int i=1;i<board.length-1;i++){
                if(board[i][0] == 'O')
                    check(board, i, 0, visited);
                if(board[i][board[0].length-1] == 'O')
                    check(board, i, board[0].length-1, visited);
            }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'O' && visited[i][j] != 1)
                    board[i][j] = 'X';
            }
        }
            
        }
    public void check(char[][] board, int i, int j, int[][] visited){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O' || visited[i][j] == 1)
            return;
        
        visited[i][j] = 1;
        
        check(board, i+1, j, visited);
        check(board, i-1, j, visited);
        check(board, i, j+1, visited);
        check(board, i, j-1, visited);
    }
}