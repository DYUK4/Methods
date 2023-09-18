import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = sum(a,b);
        System.out.println("%d + %d = %d".formatted(a,b,c));
        System.out.println("%d - %d = %d".formatted(a,b,Diff(a,b)));
        System.out.println("%d * %d = %d".formatted(a,b,Prod(a,b)));
        System.out.println("%d / %d = %f".formatted(a,b,Quot(a,b)));
//////////////////////////////// factoria //////////////////////////////////////////////////////////////////////////
        System.out.print("Введите целое число: ");
        boolean isInt = input.hasNextInt();
        if(isInt){
            int n = input.nextInt();
            System.out.println("Факториал числа %d!= %.0f".formatted(n,factoria(n)));
        }else{
            System.out.println("Ошибка ввода!");
        }
////////////////////////////////// degree ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Введите целое число и степень: ");
        boolean num = input.hasNextInt();
        if(num) {
            int number = input.nextInt();
            int degre = input.nextInt();
            System.out.print("%d ^ %d = %.0f".formatted(number, degre, degree(number, degre)));
        }else{
            System.out.println("Ошибка ввода!");
        }
    }
    //======================================================
//================ degree ==============================
    static float degree(int number, int degre){
        int sum1 = number;
        for(int i = 1; i < degre; i++) {
            sum1 = sum1 * number;
        }
        return sum1;
    }
//================ factoria ==========================

    static double factoria(int n){
        if(n==1)
            return 1;
        return n * factoria(n-1);
    }
    //=================================================
    static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    //==================================================
    static int Diff(int a, int b){
        return a - b;
    }
    //====================================================
    static int Prod(int a, int b){
        //Product - Произведение
        return a * b;
    }
    //========================================================
    static double Quot(int a, int b){
        // Quotient - частное
        return (double)a / b;
    }
//===========================================================
}
     */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//+++++++++++================ второй вариант ================================++++++++++++++++++++++++++=======================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
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