package Generic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class GenericTest {

    @Test
    public void GetMaximum() {
        Generic max= new Generic();
        String value = max.Maximum("Apple","Peach","Banana");
        Assertions.assertEquals("Apple",value);
    }
    @Test
        public void GetMaximum() {
        Generic max= new Generic();
        String value = max.Maximum("Apple","Peach","Banana");
            Assertions.assertEquals("Peach",value);
        }
        @Test
        public void GetMaximum() {
            Generic max= new Generic();
            String value = max.Maximum("Apple","Peach","Banana");
            Assertions.assertEquals("Banana",value);
        }
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