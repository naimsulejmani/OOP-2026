package introduction.interfaces.games;

public class ChessBoard implements Board {
    private RuleSet rules;

    public ChessBoard(RuleSet rules) {
        this.rules = rules;
    }
}
