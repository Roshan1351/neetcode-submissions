class Solution {
public:
    bool issafe(vector<string> &board , int col, int row, int n){

        for(int i= 0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i= row-1, j= col-1; i>= 0 && j>= 0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i= row-1, j= col+1; i>= 0 && j<n; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    void solve(vector<vector<string>> &ans, vector<string> &board, int row, int n){
        if(row==n){
            ans.push_back(board);
            return;
        }
        for(int col= 0; col<n; col++){
            if(issafe(board, col, row, n)){
                board[row][col]= 'Q';
                solve(ans, board, row+1, n);
                board[row][col]= '.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board(n , string(n,'.'));
        vector<vector<string>> ans;
        solve(ans, board, 0, n);
        return ans;
    }
};
