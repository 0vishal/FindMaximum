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
            return (T) max[max.length-1];
        }


    }
