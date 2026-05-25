package introduction.generics;

public interface ReadOnlyRepository<T, Tid> extends FindOne<T, Tid>, FindAll<T> {
}
