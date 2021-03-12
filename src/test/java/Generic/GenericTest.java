package Generic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class GenericTest {

    @Test
    public void GetMaximum() {
        Generic max= new Generic();
        int value = (int) max.Maximum(30,20,10);
        Assertions.assertEquals(30, value);
    }
    @Test
        public void GetMaximum() {
            Generic max= new Generic();
            int value = (int) max.Maximum(20,30,10);
            Assertions.assertEquals(30, value);
        }
        @Test
        public void GetMaximum() {
            Generic max= new Generic();
            int value = (int) max.Maximum(10,20,30);
            Assertions.assertEquals(30, value);
        }
}
