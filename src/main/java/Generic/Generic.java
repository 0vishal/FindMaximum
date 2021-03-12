package Generic;


    public class Generic {


        public String Maximum(String N1, String N2, String N3 ) {
            if (N1.compareTo(N2) > 0 && N1.compareTo(N3) > 0)
                return N1;
            else if (N2.compareTo(N3) > 0 && N2.compareTo(N1) > 0)
                return N2;
            else
                return N3;
        }
    }
