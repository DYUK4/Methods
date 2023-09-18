import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int c = Math.sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Math.Quot(a, b)));
        

    }


}

class Math {
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int Prod(int a, int b) {
        //Product - Произведение
        return a * b;
    }

    static double Quot(int a, int b) {
        // Quotient - частное
        return (double) a / b;
    }
}
