package introduction.generics;

@FunctionalInterface
public interface FindOne<T, TId> {
    public T findOne(TId id);
}
