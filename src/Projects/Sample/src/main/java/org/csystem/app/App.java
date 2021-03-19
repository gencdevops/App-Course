
package org.csystem.app;


import org.csystem.util.recursion.Util;


class App {
    public static void main(String[] args) {

      for(int i = 1; i <= 13; i++)
          System.out.println(i +" Faktoriyel = " + Util.factoriel(i));
    }
}
