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
public class trapecio {

    public static void main(String[] args) {
        double a = -1;
        double b = 1.5;
        int n = 4;
        double h = (b - a) / n;
        double c = a + h;
        double sumatoria = 0;

        while (c < b) {
            sumatoria = sumatoria + f(c);
            c = c + h;
        }

        System.out.println((h / 2) * (f(a) + f(b) + 2 * sumatoria));

    }

    public static double f(double x) {
        return Math.tan(x);
    }
}
