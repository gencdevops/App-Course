
package org.csystem.app;


import java.sql.SQLOutput;

class App {
    public static void main(String[] args) {

      for(int i = 1; i <= 15; i++)
          System.out.println(i +" Faktoriyel = " + Factoriel.faktoriyelHesapla(i));
    }
}

class Factoriel {
    public static long faktoriyelHesapla(int n) {
        if(n <= 1) {
            return 1;
        }

        long result = 1;

        for(int i = 1; i <= n; i++)
            result *= i;

        return result;

    }
}
