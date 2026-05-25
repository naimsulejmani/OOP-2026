package introduction.generics;

public interface CrudRepository<T, Tid> extends ReadOnlyRepository<T, Tid>, WriteOnlyRepository<T, Tid> {
}
