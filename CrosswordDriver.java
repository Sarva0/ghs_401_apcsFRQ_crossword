public class CrosswordDriver {
    public static final boolean T = true;
    public static final boolean F = false;
    public static void main(String[] args) {
        boolean[][] board = {
            { T, F, F, T, T, T, F, F, F },
            { F, F, F, F, T, F, F, F, F },
            { F, F, F, F, F, F, T, T, T },
            { F, F, T, F, F, F, T, F, F },
            { T, T, T, F, F, F, F, F, F },
            { F, F, F, F, T, F, F, F, F },
            { F, F, F, T, T, T, F, F, T },
        };

        Crossword myPuzzle = new Crossword(board);
        System.out.println(myPuzzle);
    }
}
