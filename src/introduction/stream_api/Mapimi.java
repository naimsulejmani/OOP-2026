package introduction.stream_api;

@FunctionalInterface
public interface Mapimi<T, U> {
    U apply(T item);
}
