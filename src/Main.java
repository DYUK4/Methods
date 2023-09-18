import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        factorial f = new factorial();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();

        int sum = f.fact(n);
        System.out.println("Факториал числа %d = %d".formatted(n, f.fact(n)));
    }
}

class factorial {
    int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
