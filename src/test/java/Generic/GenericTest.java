package Generic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class GenericTest {

    @Test
    public void GetMaximum() {
        Generic max= new Generic();
        Double value = (Double) max.Maximum(30.0,20.0,10.0);
        Assertions.assertEquals(30.0, value);
    }
    @Test
        public void GetMaximum() {
            Generic max= new Generic();
        Double value = (Double) max.Maximum(20.0,30.0,10.0);
            Assertions.assertEquals(30.0, value);
        }
        @Test
        public void GetMaximum() {
            Generic max= new Generic();
            Double value = (Double) max.Maximum(10.0,20.0,30.0);
            Assertions.assertEquals(30, value);
        }
}
