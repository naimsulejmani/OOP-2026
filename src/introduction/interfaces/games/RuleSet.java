package introduction.interfaces.games;

public interface RuleSet {
    boolean isLegalMove(Move m, Board b);

    void makeMove(Move m, Board b);
}
