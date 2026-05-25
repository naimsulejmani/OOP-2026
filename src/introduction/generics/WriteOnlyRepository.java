package introduction.generics;

public interface WriteOnlyRepository<T, Tid> extends Add<T>, Update<T, Tid>, Delete<Tid> {
}
