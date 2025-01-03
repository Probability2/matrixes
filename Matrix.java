import java.util.Scanner;

public class Matrix implements Printer {
    private int[][] matrix_;
    private final int m_;
    private final int n_;

    public Matrix(int m, int n) {
        this.matrix_ = new int[m][n];
        this.m_ = m;
        this.n_ = n;
    }

    public int[][] GetMatrix() {
        return matrix_;
    }

    public int rows() {
        return m_;
    }

    public int columns() {
        return n_;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m_; ++i) {
            for (int j = 0; j < n_; ++j) {
                matrix_[i][j] = scanner.nextInt();
            }
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < m_; ++i) {
            for (int j = 0; j < n_; ++j) {
                System.out.print(matrix_[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
