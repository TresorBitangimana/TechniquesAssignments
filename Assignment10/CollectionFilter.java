package Assignment10;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFilter<T> {

    public static <T> List<T> filterList(List<T> items, Predicate<T> condition) {
        return items.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}
