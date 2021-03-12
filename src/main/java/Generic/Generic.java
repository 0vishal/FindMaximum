package Generic;


import java.util.Arrays;

public class Generic <D extends Comparable<D>> {

        D [] max;


        public Generic(D...max)
        {
            this.max=max;
        }

        public <T extends Comparable<T>> T maximum()
        {
            Arrays.sort(max);
            int result = (T) max[max.length-1];
            PrintMaximum(result);
            return result;

        }
        public static <T> void PrintMaximum(D result)
        {
        System.out.println("Maximum is:  "+result);
        }

    }
