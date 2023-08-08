import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskOnJava {
    public static <K> Map<K, Integer> valueCounter(List<K> list) {
        Map<K, Integer> result = new HashMap<>();
        if (list == null) return result;
        list.forEach(item -> {
            result.computeIfPresent(item, (a, b) -> b + 1);
            result.computeIfAbsent(item, b -> 1);
        });
        return result;
    }
}
