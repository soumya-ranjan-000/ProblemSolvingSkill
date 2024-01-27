package sorting.implementation;

public class ScoreBoard {
    private int numEntries=0;
    private GameEntry[] board;
    public ScoreBoard(int capacity){
        board=new GameEntry[capacity];
    }

    public GameEntry[] getBoard() {
        return board;
    }

    void insertScoreUsingInsetionSort(GameEntry entry){
        int boardSize= board.length;
        if(numEntries<boardSize){
            int j=numEntries;
            if (j==0) board[j]=entry;
            while (j>0 && board[j-1].getScore()<entry.getScore()){
             board[j]=board[j-1];
             j--;
             if(j==0) break;
            }
            board[j]=entry;
            if (numEntries<boardSize-1) numEntries++;
        }


//        if(numEntries<boardSize || entry.getScore()>board[numEntries-1].getScore()){
//            if (numEntries<boardSize) numEntries++;
//            int j=numEntries-1;
//            while (j>0 && board[j-1].getScore()<entry.getScore()){
//                board[j]=board[j-1];
//                j--;
//            }
//            board[j]=entry;
//        }
    }
    void insertScore(GameEntry entry){
        if(numEntries<board.length){
            board[numEntries]=entry;
            numEntries++;
        }
    }
    void sortScore(){ //using insertion sort
        int boardSize= board.length;
        for(int i=1;i<boardSize;i++){
            for (int j=i;j>0&&(board[j].getScore()>board[j-1].getScore());j--){
                GameEntry temp=board[j];
                board[j]=board[j-1];
                board[j-1]=temp;
            }
        }
    }
}
