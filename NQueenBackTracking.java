import java.util.*;
public class NQueenBackTracking {

    /** permutation problem ------------------- */
    // public static void printPermutation(String str , String perm,int idx){
    //     if(str.length() == 0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for (int i = 0; i<str.length();i++){
    //         char currChar = str.charAt(i);
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         printPermutation(newStr, perm +currChar, idx +1);
    //     }
    // }


    /** N-Queen problem:- check all posible safe position of n queen of n x n chease board(code is for online platform)----------------------  */
    public List<List<String>>  solveNQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }
    public void helper(char[][] board , List<List<String>> allBoard,int col){
        if(col == board.length){
            saveBoard(board,allBoard);
            return;
        }
        for(int row = 0; row< board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal
        for (int j = 0; j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i = 0; i<board[0].length;i++){
            if(board [i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r =row;
        for(int c=col; c>=0 && r>=0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r= row;
        for (int c =col ; c<board.length && r>=0;r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // lower left
        r = row ;
        for (int c= col; c>=0&&r<board.length;r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right 
        r=row ;
        for(int c=col;c<board.length&& r>=0; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        } 
        return true;   
    }
    public void saveBoard (char[][] board, List<List<String>> allBoard){
        String row ="";
        List<String> newBoard = new ArrayList<>(); 
        for(int i = 0; i<board.length;i++){
            row = "";
            for(int j =0 ; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row+= 'Q';
                }else row +='.';
            }   
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }  
    
    public static void main(String[] args) {

        // String str ="ABC";
        // printPermutation(str, "", 0);
        

        
    }
}
