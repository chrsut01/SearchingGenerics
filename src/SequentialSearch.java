import java.util.List;

public class SequentialSearch implements ISearchStrategy {
    @Override
    public <T extends Comparable<T>> T doSearch(List<T> objects, T wanted) {


        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).equals(wanted))
                return objects.get(i);
        }
        return null;

    }
}