
// Java imports
import java.util.List;
import java.util.Set;

/**
 *
 * @author spangsberg
 */
public class Search {
    private ISearchStrategy strategy;

    /**
     * Constructor that sets the chosen ISearchStrategy object
     * @param strategy
     */
    public Search(ISearchStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Primary search method of the Searcher
     * @param objects
     * @param wanted
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T doSearch(List<T> objects, T wanted) {
        return strategy.doSearch(objects, wanted);
    }

  /*  public void setStrategy(ISearchStrategy strategy) {this.strategy = strategy;}

    public void search(int phone) {
        strategy.doSearch();*/
    }




