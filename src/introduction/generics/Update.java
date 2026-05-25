package introduction.generics;

@FunctionalInterface
public interface Update<T, TId> {
    boolean update(TId id, T data);
}
