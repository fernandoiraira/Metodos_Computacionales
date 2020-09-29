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
public class simpson {

    public static void main(String[] args) {
        double a = 0;
        double b = 2;
        int n = 5;
        double h = (b - a) / n;
        double c = a + h;
        double sumatoriaPar = 0;
        double sumatoriaImpar = 0;

        while (c < b) {
            sumatoriaImpar = sumatoriaImpar + f(c);
            c = c + (2 * h);
        }

        c = a + (2 * h);

        while (c < b) {
            sumatoriaPar = sumatoriaPar + f(c);
            c = c + (2 * h);
        }

        System.out.println(((h / 3) * (f(a) + f(b) + (4 * sumatoriaImpar) + (2 * sumatoriaPar))));
    }

    public static double f(double x) {
        return Math.sin(x);
    }
}
