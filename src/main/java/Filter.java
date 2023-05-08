import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        return source
                .stream()
                .filter(integer -> {
                    if (integer >= treshold) {
                        logger.log(String.format("Элемент \"%d\" проходит", integer));
                        return true;
                    } else {
                        logger.log(String.format("Элемент \"%d\" не проходит", integer));
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}
