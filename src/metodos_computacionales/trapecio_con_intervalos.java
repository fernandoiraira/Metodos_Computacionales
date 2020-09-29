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
public class trapecio_con_intervalos {

    public static void main(String[] args) {
        ///////////////////MODIFICAR ESTO///////////////////
        double[] x = {0, 1, 2, 3, 4};
        double[] intervalos = {1, 4.75, 3, 0, 0};
        ///////////////////MODIFICAR ESTO///////////////////
        
        double a = x[0];
        double b = x[x.length - 1];
        double h = (b - a) / (x.length - 1);
        double suma = 0;

        System.out.println("h: " + h);
        for (int i = 1; i < intervalos.length; i++) {
            suma = suma + intervalos[i];
        }

        System.out.println("Area : " + ((h / 2) * (intervalos[0] + intervalos[intervalos.length - 1] + (2 * suma))));
    }

}
