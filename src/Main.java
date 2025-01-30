import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите верхний предел: ");
        double N = in.nextDouble(); // Метод ввода
        System.out.println("Введите x: ");
        double x = in.nextDouble(); // Считываем значение x
        in.close();
        double sum = 0;
        for (int n = 0; n < N; n++) {
            double temp = Math.pow(-1, n) * Math.pow(x, n) / factorial(n);
            sum += temp;
        }

        System.out.println(sum);
    }
        public static long factorial (int n) {
            if (n == 0 ) {
            return 1; }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; }
        return result;
        }
}
