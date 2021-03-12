package Generic;


    public class Generic {


        public String <D extends comparable <D>> D Maximum (D A, D B, D C ) {
            if (A.compareTo(B) > 0 && A.compareTo(C) > 0)
                return A;
            else if (B.compareTo(C) > 0 && B.compareTo(C) > 0)
                return B;
            else
                return C;
        }


    }
