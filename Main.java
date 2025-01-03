import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String s = scanner.next();
            if (s.equals("sum")) {
                System.out.println("Size of matrixes:");
                System.out.print("Rows: ");
                int m = scanner.nextInt();
                System.out.print("Columns: ");
                int n = scanner.nextInt();
                Matrix m1 = new Matrix(m, n);
                Matrix m2 = new Matrix(m, n);
                System.out.println("First matrix:");
                m1.input();
                System.out.println("Second matrix:");
                m2.input();
                Addition res = new Addition(m1, m2);
                System.out.println("The result");
                res.print();
            } else if (s.equals("exit") || s.equals("stop")) {
                break;
            } else {
                continue;
            }
        }
    }
}