package org.csystem.util.recursion;

public class Util {
   public static long factoriel(int n) {
       if(n <= 1)
           return 1;

       long result = n * factoriel(n - 1);

       return result;
   }

}
