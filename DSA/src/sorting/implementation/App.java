package sorting.implementation;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ScoreBoard board=new ScoreBoard(4);
//        board.insertScore(new GameEntry("Mike",1105));
//        board.insertScore(new GameEntry("Rob",750));
//        board.insertScore(new GameEntry("Paul",720));
//        board.insertScore(new GameEntry("Anna",660));

//        System.out.println("Before Sorting: "+ Arrays.toString(board.getBoard()));
//        board.sortScore();
//        System.out.println("After Sorting: "+ Arrays.toString(board.getBoard()));
        board.insertScoreUsingInsetionSort(new GameEntry("Mike",1105));
        board.insertScoreUsingInsetionSort(new GameEntry("Anna",660));
        board.insertScoreUsingInsetionSort(new GameEntry("Rob",750));
        board.insertScoreUsingInsetionSort(new GameEntry("Paul",720));
        board.insertScoreUsingInsetionSort(new GameEntry("Raja",820));
        board.insertScoreUsingInsetionSort(new GameEntry("Mike",2105));

        System.out.println( Arrays.toString(board.getBoard()));
    }
}
