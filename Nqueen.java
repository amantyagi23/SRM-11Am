public class Nqueen {

    boolean board[][];

    public int totalNQueens(int n) {
        return;
    }

    int helper(int row, int n) {
        int count = 0;

        if (row == n) {
            count++;
            return 1;

        }

        for (int col = 0; col < n; col++) {

            if (willIPlaceOrNot(row, col)) {
                board[row][col] = true;
                helper(row + 1, n);
                board[row][col] = false;
            }

        }

        return count;
    }

    boolean willIPlaceOrNot(int row, int col) {

        //
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == true) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
