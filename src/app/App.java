package app;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Soma s = new Soma();
        Subtracao sb = new Subtracao();
        Multiplicacao m = new Multiplicacao();
        Divisao di = new Divisao();

        double x;
        double y;
        System.out.printf("Informe X: ");
        y = sc.nextDouble();

        System.out.printf("Informe Y: ");
        x = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Soma          -> "+ s.soma(x, y));
        System.out.println("Subtração     -> "+ sb.subtracao(x, y));
        System.out.println("Multiplicação -> "+ m.multiplicacao(x, y));
        System.out.println("Divisão       -> "+ di.divisao(x, y));
    }
}