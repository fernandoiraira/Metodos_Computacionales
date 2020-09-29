/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_computacionales;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
public class simpson_con_intervalos {

    public static void main(String[] args) {
        ///////////////////MODIFICAR ESTO///////////////////
        double[] x = {0, 1, 2, 3, 4};
        double[] intervalos = {1, 4.75, 3, 0, 0};
        ///////////////////MODIFICAR ESTO///////////////////
        
        double a = x[0];
        double b = x[x.length - 1];
        double h = (b - a) / (x.length - 1);
        double sumaImpar = 0;
        double sumaPar = 0;

        System.out.println("h: " + h);
        for (int i = 1; i < intervalos.length; i = i + 2) {
            sumaImpar = sumaImpar + intervalos[i];
        }

        for (int i = 2; i < intervalos.length; i = i + 2) {
            sumaPar = sumaPar + intervalos[i];
        }

        System.out.println("SumaPar: " + sumaPar);
        System.out.println("SumaImpar: " + sumaImpar);
        System.out.println("Area : " + ((h / 3) * (intervalos[0] + intervalos[intervalos.length - 1] + (4 * sumaImpar) + (2 * sumaPar))));
    }

}
