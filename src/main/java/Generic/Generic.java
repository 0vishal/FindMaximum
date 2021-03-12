package Generic;


    public class Generic <D extends Comparable<D>> {

        D A, B, C;

        private Generic(D A, D B, D C) {
            this.A = A;
            this.B = B;
            this.C = C;
        }

        public D getmaximum() {
            return Generic.Maximum(A, B, C);
        }

    }

        public String <D extends comparable <D>> D Maximum (D A, D B, D C ) {
            if (A.compareTo(B) > 0 && A.compareTo(C) > 0)
                return A;
            else if (B.compareTo(C) > 0 && B.compareTo(C) > 0)
                return B;
            else
                return C;
        }

    }
