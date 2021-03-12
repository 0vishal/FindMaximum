package Generic;

import java.util.Arrays;


    public class Generic {


        public int Maximum(Integer N1, Integer N2, Integer N3 ) {
            if (N1.compareTo(N2) > 0 && N1.compareTo(N3) > 0)
                return N1;
            else if (N2.compareTo(N3) > 0 && N2.compareTo(N1) > 0)
                return N2;
            else
                return N3;
        }
    }
