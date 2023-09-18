import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        factorial f = new factorial();
        System.out.print("Введите число: ");
        int n = input.nextInt();
        System.out.println("%d != %.0f".formatted(n, f.fact(n)));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        degree d = new degree();
        System.out.print("Введите целое число и степень: ");
        int number = input.nextInt();
        int degre = input.nextInt();
        System.out.print("%d ^ %d = %.0f".formatted(number, degre,d.deg(number, degre)));
    }
}
//=================================================================================================================
class factorial {

    double fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
//==================================================================================================================
class degree {

    double deg(int number, int degre) {
        int sum1 = number;
        for (int i = 1; i < degre; i++) {
            sum1 = sum1 * number;
        }
        return sum1;
    }
}
