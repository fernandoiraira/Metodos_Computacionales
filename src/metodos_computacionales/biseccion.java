/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_computacionales;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class biseccion {

    public static void main(String[] args) {
        double a = 1.4;
        double b = 3;
        double error = 0.1;
        double r;
        int c = 1;

        if (f(a) * f(b) < 0) {
            while (Math.abs(a - b) >= error) {
                r = (a + b) / 2;
                System.out.println("Iteracion " + c);
                System.out.println("f(a): " + f(a));
                System.out.println("f(r): " + f(r));
                System.out.println("f(b): " + f(b));
                System.out.println("Error:" + Math.abs(a - b));
                if (f(a) * f(r) < 0) {
                    b = r;
                } else {
                    a = r;
                }
                c++;
            }
            r = (a + b) / 2;

            System.out.println("Iteracion " + c);
            System.out.println("f(a): " + f(a));
            System.out.println("f(r): " + f(r));
            System.out.println("f(b): " + f(b));

            System.out.println("------------------------------------------------");
            System.out.println("Error final:" + Math.abs(a - b));
            System.out.println("Raiz aproximada: " + r);
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("No se cumple con la condicion inicial f(a) * f(b) < 0");
        }
    }

    public static double f(double x) {
        return (Math.pow(x, 3) - (2 * x) - 1);
    }
}
