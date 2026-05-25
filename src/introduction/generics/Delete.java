package introduction.generics;

@FunctionalInterface
public interface Delete<TId> {
    boolean delete(TId key);
}
