package introduction.generics;

import java.util.List;

@FunctionalInterface
public interface FindAll<T> {
    List<T> findAll();

}
