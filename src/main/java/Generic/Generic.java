package Generic;

import java.util.Arrays;


    public class Generic <T extends Comparable<T>> {

        T[] items;

        public Generic() {
            this.items= items;
        }

        public <T extends Comparable<T>> T Maximum() {
            Arrays.sort(items);
            return (T) items[items.length - 1];
        }
    }
