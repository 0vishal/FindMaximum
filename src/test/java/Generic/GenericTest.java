package Generic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class GenericTest {

        @Test
        public void GetMaximum() {
        Generic max= new Generic();
        String value = max.Maximum("Apple","Peach","Banana","Grape","Jackfruit");
        Assertions.assertEquals("Grape", value);
        }
        @Test
        public void GetMaximum() {
            Generic max= new Generic();
            int value = (int) max.Maximum(20,30,10,40,50,60);
            Assertions.assertEquals(60,value);
        }

        @Test
        public void GetMaximum() {
            Generic max= new Generic();
            Double value = (Double) max.Maximum(30.0,20.0,10.0,40.0,60.,70.0);
            Assertions.assertEquals(70.0,value);
        }
