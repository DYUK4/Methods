import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int c = sum(a,b);
        System.out.println("%d + %d = %d".formatted(a,b,c));
        System.out.println("%d - %d = %d".formatted(a,b,Diff(a,b)));
        System.out.println("%d * %d = %d".formatted(a,b,Prod(a,b)));
        System.out.println("%d / %d = %f".formatted(a,b,Quot(a,b)));
        System.out.print("Введите целое число: ");
        boolean isInt = input.hasNextInt();
        if(isInt){
            int n = input.nextInt();
            System.out.println("Факториал числа %d = %d".formatted(n,factoria(n)));
        }else{
            System.out.println("Ошибка ввода!");
        }

    }

    static int factoria(int n){
        if(n==1)
            return 1;
        return n * factoria(n-1);

    }

    static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    static int Diff(int a, int b){
        return a - b;
    }
    static int Prod(int a, int b){
        //Product - Произведение
        return a * b;
    }
    static double Quot(int a, int b){
        // Quotient - частное
        return (double)a / b;
    }

}