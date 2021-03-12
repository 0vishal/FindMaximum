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
}
