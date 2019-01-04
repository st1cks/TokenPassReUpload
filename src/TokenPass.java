public class TokenPass {
    private int[] board;
    private int currentPlayer;


    public TokenPass(int playerCount){
        this.board = new int[playerCount];
        for (int i = 0; i< playerCount; i ++){
            board [i] = 1 + (int) (10 * Math.random());
        }

        currentPlayer = (int)(playerCount * Math.random());
    }


    public void distributeCurrentPlayerTokens(){
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while (numToDistribute>0){
            nextPlayer = (nextPlayer+1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public int nextPlayer(){
        if ((currentPlayer + 1)> board.length){
            return currentPlayer = 0;
        }
        else {
            return currentPlayer+1;
        }
    }

    public void printBoard(){

        for (int i = 0; i < board.length; i ++){
            for (int a =0; a <board[i]; a++){

            }
        }
    }

    public int gameOver(){
        if (board[currentPlayer] == 0){
            return 0;
        }


    }

}
