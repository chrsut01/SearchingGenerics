import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StrategyPatternDemo {

    public static void main(String[] args) {


        final int SIZE = 10_000_000;
        List<Person> objects = new ArrayList<>();
        System.out.println("Loading Movies into list...");

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            objects.add(new Person( "Person " + i, random.nextInt(10000000,99999999)));
        }

        Random rand = new Random();
        Person wanted = new Person("Random", rand.nextInt(89999999) + 1000000);
        objects.add(wanted);

        Search seqSearch = new Search(new SequentialSearch());

    long start = System.currentTimeMillis();

    Person result = seqSearch.doSearch(objects, wanted);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-start) + " ms");

        System.out.println("Search result (Sequential Search): " + result);
        System.out.println("wanted was: " + wanted);

        System.out.println("-------------------------------------------------------");

        Search binSearch = new Search(new BinarySearch());
        long startTime = System.currentTimeMillis();

        //Collections.shuffle(objects);

        Collections.sort(objects);
        long sortTime = System.currentTimeMillis() - startTime;
        System.out.println("Binary sort time is: " + sortTime + "ms");


    start = System.currentTimeMillis();

    result = binSearch.doSearch(objects, wanted);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-start) + " ms");
        System.out.println("Search result (Binary Search): " + result);


}


}