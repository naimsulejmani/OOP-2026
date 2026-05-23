package introduction.interfaces.games;

public class GamesDemo {
    static void main() {
        RuleSet ruleSet = new ChessRules();
        Move move = new ChessMove();
        Board board = new ChessBoard(ruleSet);

        ruleSet.isLegalMove(move, board);
        ruleSet.makeMove(move, board);

        if (ruleSet instanceof ChessRules) {
            System.out.println("This is a chess game.");
        }

    }
}
