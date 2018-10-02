import java.util.Collections;

public class SortTest {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        final Class<?> clazz = Class.forName (args[1]);
        @SuppressWarnings("unchecked")
        final java.util.List<Integer> list =(java.util.List<Integer>) clazz.newInstance();
        int range = Integer.parseInt(args[0]);
        SelectionSort ss = new SelectionSort();
        for(int k = 0; k < range; k++){
           list.add(k+1);
        }
        /**
         * Creates a Stop Watch object 
         */
        final StopWatch sw = new StopWatch(true);
        for(int i = 0; i < 25; i++){
            Collections.shuffle(list);
            sw.start();
            ss.sort(list);
            sw.stop();
        }
        final double averageTime = sw.getAverageTime();
        System.out.println(averageTime);
    }
}
