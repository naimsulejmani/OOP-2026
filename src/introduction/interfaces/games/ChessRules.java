package introduction.interfaces.games;

public class ChessRules implements RuleSet {
    @Override
    public boolean isLegalMove(Move m, Board b) {
        // Implement chess move legality logic here
        return true; // Placeholder
    }

    @Override
    public void makeMove(Move m, Board b) {
        // Implement chess move execution logic here
    }
}
