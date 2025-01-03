class InvalidSizeException extends Exception {
    public InvalidSizeException(String m) {
        super(m);
    }
}

public class Addition implements Printer {
    private Matrix m1_;
    private Matrix m2_;

    public Addition(Matrix m1, Matrix m2) {
        try {
            if (m1.rows() != m2.rows() || m1.columns() != m2.columns()) {
                throw new InvalidSizeException("The sizes of matrixes in addition must be equal");
            }
            this.m1_ = m1;
            this.m2_ = m2;
        } catch(InvalidSizeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < m1_.rows(); ++i) {
            for (int j = 0; j < m1_.columns(); ++j) {
                System.out.print(m1_.GetMatrix()[i][j] + m2_.GetMatrix()[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
